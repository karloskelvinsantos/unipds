alter table if exists tbl_session
    add column id_conference integer;

alter table if exists tbl_session
    add constraint fk_conference_id
    foreign key (id_conference)
    references tbl_conference;