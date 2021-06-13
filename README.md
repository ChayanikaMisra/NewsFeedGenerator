# NewsFeedGenerator

**Social Networking site** which alllows users to follow each other and create posts. The service stores **pre-computed profile feed and news feed** for each user aggregated in a document DB during write **using write fan-out model** instead of computing during the read. This makes fetching news feed much faster considering in social networks the reads are much higher in number compared to the writes.

So, when an user user1 posts something, the service adds the post to user1's profile feed and uses the write fan-out model to add the post to all user1's followers news feed.

**Because the news feed is pre-computed for each user, this solves the design problem of fetching the news feed process being time consuming when a user logs in to view his/her news feed, specially if the user follows plenty of other users** (which will mean multiple queries in a relational eco system, one for fetching all users the user follows, then fetching each users post and aggregating into a news feed)


## Why Couch DB?

Couch DB is  a Document DB. Documents DBs are a class of NoSQL databases that store flexible JSON-like documents which are dynamic and self-describing, so you don't need to first pre-define the schema in the database. In our its the right choice because, we want a flexible schema to add more fields to a user's profile and also we want to store the data in an aggregated form to avoid multiple joins.

## Getting started with Couch DB 






