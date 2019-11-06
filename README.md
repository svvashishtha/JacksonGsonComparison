# JacksonGsonComparison
An app to compare the performance of Jackson and gson.

Recently we faced an issue where Gson does not respect the default values provided in a Kotlin data class when creating object from a serialized json string. You can check out this article here for more context https://proandroiddev.com/most-elegant-way-of-using-gson-kotlin-with-default-values-and-null-safety-b6216ac5328c.
<p> We started considering Jackson for our app, but we wanted to see whether jackson is a better approach in terms of speed.</p>
<p> So we decided to make an app that can provide us with answers by running on an actual device. </p>

We picked some random json files with nested structures and queued the serialization and deserialization jobs in a loop that runs  1000 times(as per config, which can be changed).

So far, we have concluded that Jackson is much faster alternative for serialization and deserialization.
Any contributions are welcome. 
