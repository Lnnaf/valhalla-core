create table account
(
    id       bigint auto_increment
        primary key,
    password varchar(255) not null,
    username varchar(255) not null,
    constraint UK_gex1lmaqpg0ir5g1f5eftyaa1
        unique (username),
    constraint UK_kac9tccc5hqgp38g91wc6o2rn
        unique (password)
);

create table ads_banner_entity
(
    id           bigint auto_increment
        primary key,
    date_expiry  datetime(6)  null,
    description  varchar(255) null,
    image_url    varchar(255) null,
    redirect_url varchar(255) null,
    title        varchar(255) null
);

create table product_category_entity
(
    id   bigint auto_increment
        primary key,
    name varchar(255) null
);

create table product_entity
(
    id                  bigint auto_increment
        primary key,
    description         varchar(255) null,
    discount_percentage double       not null,
    name                varchar(255) null,
    original_price      double       not null,
    quantity            int          not null,
    quantity_available  int          not null,
    category_id         bigint       null,
    constraint FK2yeorxxpm78djs1sfy9ujkdan
        foreign key (category_id) references product_category_entity (id)
);

create table product_image_entity
(
    id         bigint auto_increment
        primary key,
    url        varchar(255) null,
    product_id bigint       null,
    constraint FK2dmu6alah61c15yu1em3jld86
        foreign key (product_id) references product_entity (id)
);

create table role
(
    id   bigint auto_increment
        primary key,
    name varchar(255) null
);

create table account_role
(
    id         bigint auto_increment
        primary key,
    account_id bigint null,
    role_id    bigint null,
    constraint FK1f8y4iy71kb1arff79s71j0dh
        foreign key (account_id) references account (id),
    constraint FKrs2s3m3039h0xt8d5yhwbuyam
        foreign key (role_id) references role (id)
);

create table system_user_entity
(
    id         bigint auto_increment
        primary key,
    birth_day  datetime(6)  null,
    email      varchar(255) null,
    full_name  varchar(255) null,
    phone      varchar(255) null,
    user_type  smallint     null,
    username   varchar(255) null,
    account_id bigint       null,
    constraint FKmh78qgnm8xouquywdsw7qdyk
        foreign key (account_id) references account (id)
);

create table customer_entity
(
    joined_day datetime(6) null,
    point      double      null,
    id         bigint      not null
        primary key,
    constraint FK8uadt8mb0f2c28x3w0bo8bsho
        foreign key (id) references system_user_entity (id)
);

create table discount_code_entity
(
    id            bigint auto_increment
        primary key,
    amount        double       not null,
    code          varchar(255) null,
    created_date  datetime(6)  null,
    description   varchar(255) null,
    expired_date  datetime(6)  null,
    last_modifier datetime(6)  null,
    stock         double       not null,
    author_id     bigint       null,
    constraint FKf09bm3hodebold5uadtg2anir
        foreign key (author_id) references system_user_entity (id)
);

create table customer_order_entity
(
    id               bigint auto_increment
        primary key,
    original_price   double not null,
    total_price      double not null,
    customer_id      bigint null,
    discount_code_id bigint null,
    constraint FK1gysy36xhnqef1itiirxa3336
        foreign key (discount_code_id) references discount_code_entity (id),
    constraint FK97jn5rnjmkwbk0h1ba3f1l9m3
        foreign key (customer_id) references customer_entity (id)
);

create table order_detail_entity
(
    id                bigint auto_increment
        primary key,
    quantity          int    not null,
    customer_order_id bigint null,
    product_id        bigint null,
    constraint FK11anwqbe9mryv4e4dhdgkbl46
        foreign key (customer_order_id) references customer_order_entity (id),
    constraint FKg8u6g80ebrefep6so6f9br7uv
        foreign key (product_id) references product_entity (id)
);


