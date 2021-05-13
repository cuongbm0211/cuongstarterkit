CREATE TABLE persons
(
    `id`            varchar(36) NOT NULL,
    `name`          varchar(36) NULL,
    `created_date`  datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3),
    `updated_date`  datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3),
    PRIMARY KEY (`id`)
);