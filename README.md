# Dancing Space

1. What is the proposed name for your Web application?
    - Dancing space
2. Who is the target audience for your Web application?
    - People who are interested in dancing and would like to know and watch different style of dancing.
3. What problem is it intended to solve for the target audience?
    - There's lots of dancing types like tango, waltz, samba, jazz, popping, folk dance, etc. This place is a platform for anyone who interested in dancing to search for types they prefer. It’s not only to enjoy the pictures, videos of dancing, but also share experience and ideas. For instance, beginners are able to learn other’s experience to develop their fields. I'll provide photos, videos, reviews, individualized recommendations and links.
4. How will it meet the minimum project requirements?
    - My site will use the freemium model. Most of the content will be freely accessible and some of the content will be charged for downloading. If users want to write comments and interact with each other, a login will be required. Otherwise, users could watch the videos or reviews without login. PayPal will be used as payment method. I’m the beginner in this area since I’m from petroleum and geology science. So these are what I think right now based on the knowledge I learned. I’ll try hard to add more things during the learning of the semester.
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - My site will be a good resource for people users to find out a new way to enjoy dancing and share their experiences. I will track site usage, view comments frequently, sort out the most popular types of dancing. So that I can recommend popular and interesting dancing events to inactive users by sending messages.


## Build status

TODO : Modify to match your project specific Travis Build
[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-mengru822.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-mengru822)

## Changelog
[changelog](CHANGELOG.md)

## Web Site

DanceSpace(https://agile-mountain-46991.herokuapp.com/)


## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
