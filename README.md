A simple Spring Boot application that uses PostgreSQL database.
The data in the CSV file was downloaded from [Wahapedia](https://wahapedia.ru/wh40k10ed/the-rules/data-export/). Since the source file mixes integers and text and I was too lazy to parse the file, all columns in my database are of VARCHAR type.

![Response with no parameters](/screenshots/no_parameters.png)
![Response with parameters](/screenshots/parameters.png)
