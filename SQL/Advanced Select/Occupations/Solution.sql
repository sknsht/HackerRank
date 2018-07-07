SELECT *
FROM
  (SELECT MIN(DOCTOR) MIN_DOCTOR,
          MIN(PROFESSOR) MIN_PROFESSOR,
          MIN(SINGER) MIN_SINGER,
          MIN(ACTOR) MIN_ACTOR
   FROM
     (SELECT CASE
                 WHEN OCCUPATION = 'Doctor' THEN NAME
             END AS DOCTOR,
             CASE
                 WHEN OCCUPATION = 'Professor' THEN NAME
             END AS PROFESSOR,
             CASE
                 WHEN OCCUPATION = 'Singer' THEN NAME
             END AS SINGER,
             CASE
                 WHEN OCCUPATION = 'Actor' THEN NAME
             END AS ACTOR,
             RANK() OVER (PARTITION BY OCCUPATION
                          ORDER BY NAME) AS ROW_RANK
      FROM OCCUPATIONS) X
   GROUP BY ROW_RANK)
ORDER BY MIN_DOCTOR,
         MIN_PROFESSOR,
         MIN_SINGER,
         MIN_ACTOR;