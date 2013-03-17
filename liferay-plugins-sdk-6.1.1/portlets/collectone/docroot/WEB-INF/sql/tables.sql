create table collectone_Account (
	account_id INTEGER not null primary key,
	company_Id INTEGER,
	name VARCHAR(75) null,
	first_name VARCHAR(75) null,
	last_name VARCHAR(75) null,
	date_ DATE null,
	active_ BOOLEAN
);

create table collectone_Company (
	company_id INTEGER not null primary key,
	name VARCHAR(75) null,
	date_ DATE null
);