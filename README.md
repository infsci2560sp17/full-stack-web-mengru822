# Dancing Space

1. What is the proposed name for your Web application?
    - Dancing space
2. Who is the target audience for your Web application?
    - People who are interested in dancing and would like to know and watch different style of dancing.
3. What problem is it intended to solve for the target audience?
    - There's lots of dancing types like tango, waltz, samba, jazz, popping, folk dance, etc. This place is a platform for anyone who interested in dancing to search for types they prefer. It’s not only to enjoy the pictures, videos of dancing, but also share experience and ideas. For instance, beginners are able to learn other’s experience to develop their fields. I'll provide photos, videos, reviews, individualized recommendations and links.
4. How will it meet the minimum project requirements? 
    - My site will use the freemium model. Dance lovers can find pictures, videos, music, goods about different type of dance. Also users who want to share experience and ideas with others will find much fun here. Beginners who want to learn other’s experience to develop their fields and experts who want to teach and improve their dance skills will communicate with each others. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - My site will be a good resource for people users to find out a new way to enjoy dancing and share their experiences. Users can use add, delete and edit buttons to find all they needs. Also upload the file is important and useful for users. And there is no dancing web for users to not only enjoy the dance but also find goods to buy. I will track site usage, view comments frequently, sort out the most popular types of dancing. So that I can recommend popular and interesting dancing events to inactive users by sending messages.


## Build status

TODO : Modify to match your project specific Travis Build
[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-mengru822.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-mengru822)

## Changelog
[changelog](CHANGELOG.md)

## Web Site

[Dancing Space](https://agile-mountain-46991.herokuapp.com/)


## Key Features


* Enables users login
* Add options( for dance, music, goods)
* Delete options, edit options
* Top navigation bar in home page 
* Carousel Slides
* User can share his or her own likes
* File upload


## Project Details

### Landing Page

In the welcome page(landing page), there is a "enter" for users clicking. In order to get the resource, users need to login. After login, there are 4 options( dance, music, goods, share) in main page that users can click and to the page that users like. Also, users can enjoy the slides of different type of dance.  
![](/src/main/Welcome.JPG)
### User Input Form


Users can add their own likes by choosing the type of dance, and entering the name, difficult, times. After finish typing the information, users can uplaod the information to database and it will show on the table above. If users type wrong information, edit button can help to correct it. Also users can type the id number to delete. And there’s back button to return to main page.
![](/src/main/Dance.JPG)

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
