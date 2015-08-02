# Chapter 2 - Building a GWT application: Saying Hello World #

The emphasis of chapter 2 is on you using the GWT tools (specifically the Google Plugin for Eclipse) to create a basic GWT application.



We look at what is created, why, and how.



We examine the process for the following:

  * Dev mode
  * Super Dev Mode
  * GWT Compiler
  * Bootstrapping process
  * Application structure
  * Difference between Java packages and GWT modules

## Super Dev Mode in GWT 2.5 ##
Super Dev Mode is new with GWT 2.5.  It is very experimental but the future of GWT by slipping loose from the need of a browser plugin.  However, for now, it is not widely supported - here it is in action in Chrome...

<img src='http://gwtinaction2.googlecode.com/svn/wiki/images/ch02/Super%20dev%20mode.png' width='500px' />

...where you can see we can debug our Java source directly in the browser's web development tool!

# Book's Chapter Contents #
  * 2.1	What is a GWT Application?
    * 2.1.1	Seeing the User’s View
    * 2.1.2	Examining the Developer’s View
    * 2.1.3	Understanding Development vs web modes
      * Development mode
      * Super Dev Mode
      * Web (production) mode
  * 2.2	Examining the options for building an application
  * 2.3	Creating the Hello World Application with the Google Plugin for Eclipse
    * 2.3.1	Creating a web Application
    * 2.3.2	Defining a GWT Module
    * 2.3.3	Adding an EntryPoint
      * Implementing some functionality
    * 2.3.4	Providing the Web Page
    * 2.3.5	Recapping the magic
  * 2.4	Running Hello World in Development mode
    * 2.4.1	Starting Development Mode in Eclipse
    * 2.4.2	Passing parameters to Development Mode
  * 2.5	Finding out Where it Went Wrong
    * 2.5.1	Checking the code in the IDE for errors
    * 2.5.2	Looking at Development Mode Output
    * 2.5.3	Reading the Console output
    * 2.5.4	Debugging in Eclipse
    * 2.5.5	Inspecting using Browser Development/Inspection Tools
  * 2.6	Compiling Hello World for web mode
    * 2.6.1	Running the GWT Compiler from Eclipse
    * 2.6.2	Welcoming the User
    * 2.6.3	Passing Parameters to the GWT compiler
  * 2.7	Understanding Modules versus packages
    * 2.7.1	What is in a GWT Module?
    * 2.7.2	What are the Benefits of Modules?
    * 2.7.3	How many modules should i have?
  * 2.8	Digging deeper into the Uncompiled Application Part of a GWT application
    * 2.8.1	Folder Structure Convention
    * 2.8.2	Package Structure Convention
    * 2.8.3	What Java can I use in GWT
    * 2.8.4	The Server Side
  * 2.9	Reviewing the Deployable Application part of a GWT application
    * 2.9.1	Harnessing different Linkers
  * 2.10	Building on your understanding
  * 2.11	Summary

[Ch3 Enhancing Hello World -->](EnhancingApp.md)