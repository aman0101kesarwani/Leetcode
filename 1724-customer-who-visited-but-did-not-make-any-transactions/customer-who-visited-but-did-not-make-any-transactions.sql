# Write your MySQL query statement below

SELECT vi.customer_id, COUNT(*) AS count_no_trans
FROM Visits vi
LEFT JOIN Transactions tr
ON vi.visit_id = tr.visit_id
WHERE tr.transaction_id IS NULL   
GROUP BY vi.customer_id;



-- SELECT vi.customer_id, COUNT(*) AS count_no_trans
-- FROM Visits vi
-- LEFT JOIN Transactions tr
-- ON vi.visit_id = tr.visit_id
-- WHERE tr.amount IS NULL              -- here use amount or transaction_id
-- GROUP BY vi.customer_id;


