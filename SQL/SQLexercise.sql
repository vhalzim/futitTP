-- 1. Name of window with AD_Window_ID = ‘100
SELECT "Name" FROM "AD_Window" WHERE "AD_Window_ID" = 100;
-- 2. Update window with AD_Window_ID = ‘100’ appending ‘--’ to the name of window with AD_Window_ID = ‘100’
UPDATE "AD_Window" SET "Name" = "Name" || '--' WHERE "AD_Window_ID" = 100;
--3. List of all tabs in window with AD_Window_ID = ‘100’
SELECT * FROM "AD_Tab" WHERE "AD_Window_ID" = 100;

--i wasnt able to resolve by myself the 4,5 & 6th exercises.

--7. Windows with more than 5 tabs
SELECT AD_Window.*, COUNT(AD_Tab.id) AS TabCount FROM AD_Window;