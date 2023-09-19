# Toppan
This is for Toppan Technical Test at below

[Technical Challenge (Backend).pdf](https://github.com/cheejin96/toppan/files/12662258/Technical.Challenge.Backend.pdf)

# Environment
Here describe how to run the project in Eclipse.

1. Clone the project from this git.
2. Run the project as image below
![image](https://github.com/cheejin96/toppan/assets/20693378/cb8fad3e-c745-4211-99d6-304d656c5ca9)

3. Please ensure you have D drive in your testing device and it is accessible. As this project is run with H2 database with predefined location "D:/data/database". If you want to change the location, you may edit in application as shown as image below.
 ![image](https://github.com/cheejin96/toppan/assets/20693378/7a12433c-85e8-4489-9c92-8cef849a1d8c)
 
4. After successfully starting the application, you can start calling the following APIs.

# Test
Here describe how to run the Unit test

1. Locate the ToppanApplicationTests.java file under path "src/text/java"
2. Run the test case as imgae below
![image](https://github.com/cheejin96/toppan/assets/20693378/09835dd8-7ae4-4f0b-9cc7-35890a21e68e)
3. Then you should be able to see the test case status as shown as image below
![image](https://github.com/cheejin96/toppan/assets/20693378/d765b0b6-e440-4d8a-95e2-93823a3bd1f0)

# API
Below is the screenshots that show the steps to call the API

### Get University list with filtering and pagination
| API | Details |
| --- | --- |
| URL | /university |
| TYPE | GET |
| Description | This API to get university list with filtering and pagination function |

| Parameter | Type | Description |
| --- | --- | --- |
| name | Integer | Universitys name |
| country | Integer | Universitys country |
| isBookmark | Boolean | Universitys is bookmarked |
| isActive | Boolean | Universitys is active |
| createdStart | String | University created start date range |
| createdEnd | String | University created end date range |
| pageNo | Integer | page number, start from 0, by default 0 |
| pageSize | Integer | page size by default 10  |

![image](https://github.com/cheejin96/toppan/assets/20693378/dcce82fd-e026-4bb9-977d-339276eb4a27)

### Create New University
| API | Details |
| --- | --- |
| URL | /university |
| TYPE | POST |
| Description | This API is to create new university, name and country is a require |

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | University name |
| country | String | University country |
| webpages | String | University webpages |

![image](https://github.com/cheejin96/toppan/assets/20693378/28216750-239f-43a9-8205-013bdfad5e7e)


### Get University by ID
| API | Details |
| --- | --- |
| URL | /university/{id} |
| TYPE | GET |
| Description | This API is to get university by id |

![image](https://github.com/cheejin96/toppan/assets/20693378/f7439fe7-d64f-4329-aaac-7874fa5a51e1)

### Update University by ID
| API | Details |
| --- | --- |
| URL | /university/{id} |
| TYPE | PUT |
| Description | This API is to update university by id |

![image](https://github.com/cheejin96/toppan/assets/20693378/d07ac51a-b5f7-48da-b7be-af351df8cfbb)


### Delete University by ID
| API | Details |
| --- | --- |
| URL | /university/{id} |
| TYPE | DELETE |
| Description | This API is to soft delete university by id |

![image](https://github.com/cheejin96/toppan/assets/20693378/7783ed19-9a03-449c-ad8d-875c3e00eb2d)

### Bookmark University by ID
| API | Details |
| --- | --- |
| URL | /university/bookmark/{id} |
| TYPE | POST |
| Description | This API is to bookmark university by id |

![image](https://github.com/cheejin96/toppan/assets/20693378/52a3ab5c-1465-4a9d-b7b3-3f09241542a6)
