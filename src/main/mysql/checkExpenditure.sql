/*Please add ; after each select statement
https://codefights.com/challenge/o6fR4PihLJMpgqy8d
 */
CREATE PROCEDURE checkExpenditure()
  BEGIN
    SELECT a.id, IF(SUM(t.s)-value < 0, 0, SUM(t.s)-value) AS loss FROM allowable_expenditure a JOIN (SELECT ROUND(DAYOFYEAR(monday_date)/7) AS id , expenditure_sum AS s FROM expenditure_plan) t ON (left_bound <= t.id AND right_bound >= t.id) GROUP BY 1;

  END