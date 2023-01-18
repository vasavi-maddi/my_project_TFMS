use project_tfms;
Delimiter $$
drop function if exists Cal_hours;
Create function Cal_hours
(
	hours int
)
returns int deterministic
begin
	declare no_of_hours int;
    select duration from batch into no_of_hours;
    return no_of_hours/60;
end $$
select Cal_hours(duration) as hours from batch;