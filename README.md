# Backend Assignment - Comment System

## Project Overview
This is a Spring Boot backend application that implements a comment system with Redis-based rate limiting.

## Technologies Used
- Java
- Spring Boot
- PostgreSQL
- Redis
- Docker

## Features
- Create posts
- Add comments to posts
- Redis-based comment limit (max 10 comments per post)
- Exception handling for limit exceeded

## How It Works
- Each comment increments a counter in Redis
- If comment count exceeds 10, further comments are blocked

## API Endpoints

### Create Post
POST /posts

### Add Comment
POST /comments

## Testing
Tested using Postman

## Author
Santhosh M
