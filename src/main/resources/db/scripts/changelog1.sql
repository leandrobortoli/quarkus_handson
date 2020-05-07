--liquibase formatted sql

--changeset changelog1:1
CREATE TABLE IF NOT EXISTS MOVIE
(
    ID          INT          NOT NULL AUTO_INCREMENT,
    TITLE       VARCHAR(255) NOT NULL,
    DESCRIPTION TEXT         NOT NULL,
    IMDB_RATING DOUBLE,
    PRIMARY KEY (ID)
)