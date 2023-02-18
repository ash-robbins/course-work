-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet. Add yourself to the person table, and assign yourself as the director of "The Blob" (the movie is already in the movie table). (1 record each)

SELECT * FROM movie
WHERE title = 'The Blob';

INSERT INTO person (birthday)
VALUES ('11/22/1990');

SELECT * FROM person
WHERE person_name = 'Ashley Robbins';



UPDATE person SET birthday = '11/22/1990'
WHERE person_name = 'Ashley Robbins';

