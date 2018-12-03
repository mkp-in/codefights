/*Please add ; after each select statement
https://codefights.com/challenge/ane9MdhsPMqe4DZoK
*/
CREATE PROCEDURE trackingSystem()
  BEGIN
    DECLARE r DATETIME;
    DECLARE e VARCHAR(256);
    DECLARE a ,u, l INT DEFAULT -1;

    /**
    Need to declare both cursors here.
     */
    DECLARE cur1 CURSOR FOR SELECT anonymous_id , event_name, received_at FROM tracks WHERE user_id IS NULL ORDER BY 1,3 DESC;

    DECLARE cur2 CURSOR FOR SELECT user_id AS a, event_name AS e, received_at AS r FROM tracks WHERE user_id IS NOT NULL ORDER BY 1,3;

    CREATE TEMPORARY TABLE IF NOT EXISTS temp (anonym_id INT,
                                               last_null VARCHAR(256),
                                               first_notnull VARCHAR(256),
      PRIMARY KEY(`anonym_id`));

    OPEN cur1;
    BEGIN
      /**
      Declaring the done flag & continue handler.
       */
      DECLARE done INT DEFAULT 0;
      DECLARE CONTINUE HANDLER FOR NOT FOUND SET done=1;
      user_loop1: LOOP
        FETCH cur1 INTO a, e, r;

        IF done=1
        THEN
          LEAVE user_loop1;
        END IF;

        IF a != l
        THEN
          INSERT INTO temp (anonym_id,
                            last_null)
          VALUES (a, e);
        END IF;

        SET l = a;


      END LOOP user_loop1;
    END;
    CLOSE cur1;

    SET l=-1;
    OPEN cur2;
    BEGIN
      DECLARE done INT DEFAULT 0;
      DECLARE CONTINUE HANDLER FOR NOT FOUND SET done=1;
      user_loop2: LOOP
        FETCH cur2 INTO a, e, r;

        IF done=1
        THEN`
          LEAVE user_loop2;
        END IF;

        IF a != l
        THEN
          INSERT INTO temp (anonym_id,
                            first_notnull)
          VALUES (a, e)
          ON DUPLICATE KEY UPDATE first_notnull=e;
        END IF;

        SET l = a;


      END LOOP user_loop2;
    END;
    CLOSE cur2;

    SELECT * FROM temp;
    DROP TEMPORARY TABLE temp;
  END