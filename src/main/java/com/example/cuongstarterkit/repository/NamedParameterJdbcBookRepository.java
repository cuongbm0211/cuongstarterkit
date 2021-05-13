package com.example.cuongstarterkit.repository;

import com.example.cuongstarterkit.Book;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NamedParameterJdbcBookRepository extends JdbcBookRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public NamedParameterJdbcBookRepository(JdbcTemplate jdbcTemplate,
        NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        super(jdbcTemplate);
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public int update(Book book) {
        return namedParameterJdbcTemplate.update(
            "update books set price = :price where id = :id",
            new BeanPropertySqlParameterSource(book));
    }

    @Override
    public Optional<Book> findById(Long id) {
        return namedParameterJdbcTemplate.queryForObject(
            "select * from books where id = :id",
            new MapSqlParameterSource("id", id),
            (rs, rowNum) ->
                Optional.of(new Book(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getBigDecimal("price")
                ))
        );
    }

    @Override
    public List<Book> findByNameAndPrice(String name, BigDecimal price) {

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("name", "%" + name + "%");
        mapSqlParameterSource.addValue("price", price);

        return namedParameterJdbcTemplate.query(
            "select * from books where name like :name and price <= :price",
            mapSqlParameterSource,
            (rs, rowNum) ->
                new Book(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getBigDecimal("price")
                )
        );
    }
}
