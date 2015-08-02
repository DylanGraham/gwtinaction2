# Chapter 11 Using JavaScript Native Interface (JSNI) #

JSNI (JavaScript Native Interface) is GWT's way of interacting with pure JavaScript.



This chapter is a little example packed:



## Using JSNI ##
We look at how to implement a getComputedStyle method in GWT, focussing in this chapter on the JSNI aspect.

## JavaScript Object/Overlays ##
JavaScript overlay objects are extremely helpful and powerful when interacting with JavaScript.

We see in this example how to use them and how they compare to plain JavaScript objects.  We also consider a little how to load a JavaScript library.

## Wrapping JSON ##
Now that we understand overlay objects, we can see how simple they make wrapping JSON by simply grabbing and displaying a photo feed from Picasa web service.

<img src='https://gwtinaction2.googlecode.com/svn/wiki/images/Chapter%2011%20JSNI%20JSON.png' width='500px' />

## Wrapping a library ##
Time to crank up the complexity a little and see how to wrap an existing JavaScript library.

We wrap the Cooliris photo wall to get this exciting example.

<img src='https://gwtinaction2.googlecode.com/svn/wiki/images/Chapter%2011%20JSNI%20Cooliris.png' width='500px' />

## Exposing an API ##

Sometimes you'll wish to allow other users/applications to access your GWT application on the page - you'll want to expose an API using the techniques we describe in the book (and some implemented in the example)

<img src='https://gwtinaction2.googlecode.com/svn/wiki/images/Chapter%2011%20JSNI%20API.png' width='500px' />

# Book's Chapter Content #
  * 11.1	What is JSNI?
  * 11.2	Should I Use JavaScript Native Interface?
    * 11.2.1	No, it can quickly take away the benefits you are using GWT for in the first place.
    * 11.2.2	Yes, in these circumstances
  * 11.3	Benefiting from the Google Eclipse Plug-in
    * 11.3.1	Debugging JavaScript
  * 11.4	Interacting with the Browser
    * 11.4.1	Example: Getting a browser element’s computed style
      * Accessing the browser variables
    * 11.4.2	Passing data in to a JSNI method
    * 11.4.3	Passing data out of a JSNI method
  * 11.5	Handling objects from JavaScript
    * 11.5.1	Example: Using a JavaScriptObject
    * 11.5.2	Example: Extending a JavaScriptObject (an Overlay)
    * 11.5.3	Example: Overlaying JSONP data
  * 11.6	Wrapping a third party library
    * 11.6.1	Ensuring the library is loaded
      * Example: Loading Cooliris through the Module file
      * Example: Loading PERSON.JS through ScriptInjector
    * 11.6.2	Accessing Java fields from JSNI
    * 11.6.3	Calling Java methods from JSNI
    * 11.6.4	Creating Java objects within JSNI
    * 11.6.5	Handling exceptions
  * 11.7	Exposing an API to JavaScript
  * 11.8	Summary



[<-- Ch10 Data Presentation Widgets](DataPresentation.md)<pre></pre>[Ch12 Classic Ajax and Forms -->](ClassicAjax.md)