# Chapter 15 - Building MVP Applications #

We look in the book at how to build applications based on MVP (and what we mean by MVP).





In particular we cover:

  * Hand built MVP
  * Using GWT's Activity and Place
  * Code splitting in an MVP world
  * How Editors and Data Presentation widgets fit with MVP

This discussion is supported by 4 versions of a Photo application.  Each have the same set of vies but demonstrate different aspects of the four points above.  Here's the view that shows a set of photo's...

<img src='https://gwtinaction2.googlecode.com/svn/wiki/images/Chapter%2015%20mvp%20photos.png' width='500px' />

...and here's a view that show same data but in a Data Presentation widget to examine how they fit into the MVP approach.

<img src='https://gwtinaction2.googlecode.com/svn/wiki/images/Chapter%2015%20mvp%20list.png' width='500px' />

# Book's Chapter Content #
  * 15.1	What is MVP?
    * 15.1.1	The Two-way Presenter/View relationship
    * 15.1.2	Benefits of MVP
  * 15.2	Looking at the PhotoApp’s MVP foundations
    * 15.2.1	From the User’s perspective
    * 15.2.2	From the MVP perspective
  * 15.3	Building MVP ourselves
    * 15.3.1	Creating Views
      * View specific interface.
      * Implementing the views
    * 15.3.2	Presenters
      * The Root of all Presenters
      * Presenter Specific Interface
      * Implementing Specific Presenters
    * 15.3.3	Controlling the Application
  * 15.4	Altering a MVP application
    * 15.4.1	Swapping out layers
    * 15.4.2	Optimizing with Code Splitting
  * 15.5	Activities and Places (GWT’s Reference MVP Approach)
    * 15.5.1	How it will plug together.
    * 15.5.2	Activity
      * Defining
      * Initialization
      * Starting an Activity
      * Managing an Activity onCancel
      * Progressing the Activity
      * Checking if an Activity mayStop
      * Stopping an Activity
      * How Many Activities per Page?
    * 15.5.3	Places
    * 15.5.4	Place Tokenizers
      * Changing a place’s prefix
    * 15.5.5	PlacesHistoryMapper
    * 15.5.6	ActivityMapper
    * 15.5.7	Managing the Activities
    * 15.5.8	Controlling the Place
    * 15.5.9	Views
    * 15.5.10	Code Splitting with Activities and Places
  * 15.6	Fitting Editors / Data Presentation widgets into MVP?
  * 15.7	Summary


[<-- Ch14 Advanced Events and EventBus](EventBus.md)<pre></pre>[Ch16 Dependancy Injection -->](DI.md)