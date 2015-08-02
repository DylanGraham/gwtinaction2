# Chapter 4 - Creating Widgets #

Chapter 4 looks at various aspects relating to creating widgets.

<img src='http://gwtinaction2.googlecode.com/svn/wiki/images/ch04/Chapter%204%20all.png' width='500px' />





## Creating a new widget from the DOM ##
We create a Canvas widget to see how a new widget can be created from the DOM and what interfaces we migt want to add to tell developers what the widget will do.

## Extending an existing widget ##
Sometimes the functionality you want is close to an existing widget - in this case, why not extend the existing widget and add the new functionality.  We also look at overiding methods to supress existing functionality of the extended widget.

## Creating a Composite widget ##
Building Composite widgets is where you'll likely spend most of your time.  We investigate what these are and how to create and use them.

## Safe HTML ##
You always need to be aware of protecting your user from being hacked, and when creating/extending new widgets is no exception.  We look at the various tools GWT provides to help you do that and in the book discuss some of the rules you should apply.

<img src='http://gwtinaction2.googlecode.com/svn/wiki/images/ch04/Chapter%204%20safehtml.png' width='500px' />

## Animation ##
Down inside GWT is a neat way to provide animations - useful for DOM attributes (color, dimensions, locations, etc...).  It's not extensively used yet, but the scaffolding it provides can easily be harnessed, as we see.

## Layout Panels ##
Layout panels are GWT's snappy almost impossibly fast layout containers and as they're relatively new we spend some time playing with them to understand how they work.  We'll also see how to animate the panels so they change form smoothly.

<img src='http://gwtinaction2.googlecode.com/svn/wiki/images/ch04/Chapter%204%20layout.png' width='500px' />

## Elemental ##
GWT 2.5 brings along a new API which is automatically generated from W3C IDL definitions for HTML 5.  It's very experimental but creating a buz, so we take a quick look in the book how to use it, how different it is from standard GWT approach, and provide some recommendations.

# Book's Chapter Content #
  * 4.1	What is a widget, again?
  * 4.2	Create a new widget from the DOM
    * 4.2.1	Introducing the GWTiACanvas Widget
    * 4.2.2	Indicating Functionality
    * 4.2.3	Hooking up Events
    * 4.2.4	Peotecting with SafeHTML, SafeUri and SafeStyles
  * 4.3	Extending an existing widget
    * 4.3.1	Introducing the ReportSizeLabel widget
    * 4.3.2	Indicating functionality
  * 4.4	Extending a Panel
  * 4.5	Creating a composite
    * 4.5.1	Introducing the DataField question/answer widget
    * 4.5.2	Indicating Functionality
  * 4.6	Using Layout Panels
    * 4.6.1	Types of Layout Panels
    * 4.6.2	Creating Layout Panels
    * 4.6.3	Animating Layout Panels
  * 4.7	Applying animation to widgets
    * 4.7.1	Widgets that Animate
    * 4.7.2	Building our own animation
  * 4.8	Exploring the Lifecycle of a Widget
    * 4.8.1	Creating a widget
    * 4.8.2	Adding a widget
      * Handling widget attachment
    * 4.8.3	Removing a widget
      * Handling Widget Detachment
    * 4.8.4	Destroying a Widget
  * 4.9	Getting Elemental, my dear Watson!
    * 4.9.1	Examining Elemental
    * 4.9.2	Understanding the challenge
    * 4.9.3	Noting the benefit
  * 4.10	Summary


[<-- Ch3 Enhancing Hello World](EnhancingApp.md)<pre></pre>[Ch5 Using Client Bundles -->](ClientBundles.md)