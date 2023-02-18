-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)

INSERT INTO genre (genre_name)
VALUES ('Sports');

-- UPDATE movie_genre
-- SET genre_id = 11771
-- WHERE movie_id = 7214;

-- SELECT * FROM movie_genre WHERE movie_id = 7214

-- DELETE FROM movie_genre WHERE movie_id = 7214

INSERT INTO movie_genre (movie_id, genre_id)
VALUES (7214, 11771);