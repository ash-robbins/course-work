-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later, sorted alphabetically.
-- (6 rows)
SELECT g.genre_name
FROM genre g
LEFT JOIN movie_genre AS mg ON g.genre_id = mg.genre_id
JOIN movie_actor ma ON mg.movie_id = ma.movie_id
JOIN person p ON ma.actor_id = p.person_id
JOIN movie m ON ma.movie_id = m.movie_id
WHERE p.person_name = 'Robert De Niro' AND m.release_date > '1/1/2010'
GROUP BY g.genre_name
ORDER BY g.genre_name ASC
