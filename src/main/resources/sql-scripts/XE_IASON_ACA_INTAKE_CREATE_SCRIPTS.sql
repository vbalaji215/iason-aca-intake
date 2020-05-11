create sequence file_exchange_sequence start with 10001 increment by 1

create table file_exchange_tracker (
                file_id number not null, 
                file_received_date_time timestamp, 
                file_status varchar(255), 
                source_file_name varchar(255), 
                primary key (file_id))