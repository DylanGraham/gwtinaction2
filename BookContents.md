# Full contents of GWT in Action, Edition 2 #



## Chapter 1: Introducing GWT ##
  * 1.1	Unplanned consequences (or the road to GWT)
  * 1.2	Exploring the toolkit
    * 1.2.1	Compiling and optimizing
    * 1.2.2	Powerful widgets and a template binding engine
    * 1.2.3	Event handling beyond JavaScript
    * 1.2.4	Client-server communication
    * 1.2.5	Simplified development and debugging
    * 1.2.6	Integration with JavaScript
    * 1.2.7	History support
    * 1.2.8	Internationalization - Sprechen Sie Deutch?
  * 1.3	Setting up your development environment
    * 1.3.1	Installing the Java JDK
    * 1.3.2	Installing Eclipse
    * 1.3.3	Installing the Google Eclipse Plugin
    * 1.4.4	Installing the Development Mode browser plug-in
  * 1.4	Summary


## Chapter 2: Building a GWT application: Saying Hello World ##
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

## Chapter 3: Building a GWT application: Enhancing Hello World ##
  * 3.1	Re-examining the Example Application
    * 3.1.1 Enhancements
  * 3.2	Updating the HTML
  * 3.3	Enhancing the Code
  * 3.4	Creating your User Interface
    * 3.4.1	Presenting Widgets
      * Creating Widgets
      * Widget hierarchy
    * 3.4.2	Organizing layout with Panels
      * Creating a Panel
      * Types of Panels
  * 3.5	Manipulating the page
    * 3.5.1	Using the RootPanel / RootLayoutPanel
    * 3.5.2	Manipulating the DOM directly
    * 3.5.3	Playing Safe with HTML
  * 3.6	Handling Events
    * 3.6.1	What are Events
    * 3.6.2	Handling Events
    * 3.6.3	Preventing the Browser handling events for us
  * 3.7	Managing History
    * 3.7.1	Handling History in GWT
    * 3.7.2	Implementing History Management in Your Application
  * 3.8	Styling Components
    * 3.8.1	Programmatic styling
    * 3.8.2	Low level Styling
    * 3.8.3	Cascading Style Sheets
    * 3.8.4	GWT Themes
  * 3.9	Building on your Understanding
  * 3.10	Summary

## Chapter 4: Creating Widgets ##
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

## Chapter 5: Using ClientBundles ##
  * 5.1	Client Bundle Basics using DataResources
    * 5.1.1	DataResource
    * 5.1.2	The ClientBundle Interface
    * 5.1.3	Using ClientBundles in an Application
  * 5.2	Text Resource Types
    * 5.2.1	TextResource
    * 5.2.2	ExternalTextResource
  * 5.3	ImageResource
    * 5.3.1	Internationalizing Image Resources
    * 5.3.2	Using ImageResource
    * 5.3.3	Controlling ImageResource Optimizations
  * 5.4	CssResource
    * 5.4.1	Optimizations
    * 5.4.2	Constants
    * 5.4.3	Runtime Evaluation
    * 5.4.4	Nonstandard CSS Values
    * 5.4.5	Conditional sections
    * 5.4.6	Using other Resources in CSS
  * 5.5	Summary

## Chapter 6: Interface Design Using UiBinder ##
  * 6.1	Binding the designer’s HTML to Java code
    * 6.1.1	Creating the UIBinder XML template from HTML
      * Handling HTML entities
      * Using UIBinder tags and widgets in the template
      * Setting widget properties with UIBinder
    * 6.1.2	Working with panels
    * 6.1.3	Binding the UIBinder XML template to the Java code
    * 6.1.4	Binding XML template elements to Java variables
      * Binding template declarations to class fields
      * Using @UiFactory and @UiConstructor
    * 6.1.5	Making sense of it all
  * 6.2	Handling events with UIBinder
  * 6.3	Introducing the UIBinder Expression Language
  * 6.4	Applying style with UIBinder
    * 6.4.1	Using `<ui:style>` to generate a CssResource
    * 6.4.2	Accessing a generated CssResource in your widget
  * 6.5	Using the Eclipse Plug-In with UIBinder
  * 6.6	Summary

## Chapter 7: Communicating with GWT-RPC ##
  * 7.1 Surveying GWT-RPC
    * 7.1.1 Understanding asynchronous behavior
    * 7.1.2 Defining the GWT-RPC classes, interfaces, and annotations
    * 7.1.3 Understanding GWT-RPC package structure
  * 7.2 Learning GWT-PRC with Twitter
  * 7.3 Fetching data from Twitter the non-GWT way
  * 7.4 Defining a GWT-RPC compatible model
    * 7.4.1 Using the Serializable and IsSerializable interfaces
    * 7.4.2 Special considerations when using JPA/JDO model objects as a DTO
    * 7.4.3 Developing custom serializers
  * 7.5 Building and deploying the server-side
    * 7.5.1 Handling Exceptions
    * 7.5.2 Defining the service interface
    * 7.5.3 Writing the servlet
    * 7.5.4 Deploying the servlet
  * 7.6 Writing the client
    * 7.6.1 Defining the asynchronous interface
    * 7.6.2 Making the call to the server
  * 7.7 Debugging GWT-RPC
  * 7.8 Summary

## Chapter 8: Using RequestFactory ##
  * 8.1	Understanding RequestFactory architecture
    * 8.1.1	Investigating the client-side architecture
    * 8.1.2	Investigating the server-side architecture
  * 8.2	Understanding the example project in this chapter
  * 8.3	Enabling RequestFactory the simple way
    * 8.3.1	Creating proxy interfaces for the domain classes
      * Defining a proxy interface
      * Defining transportable types
    * 8.3.2	Developing the factory interface
    * 8.3.3	Using the domain class as the service
      * Adding Locator methods to the domain class
      * Adding service methods to the domain class
    * 8.3.4	Adding the RequestFactory servlet to the web.xml
  * 8.4	Making calls to the server
    * 8.4.1	Initializing RequestFactory and making a simple call to the server
    * 8.4.2	Creating and persisting using instance methods
    * 8.4.3	Fetching persisted objects from the server
    * 8.4.4	Editing domain objects and updating them on the server
    * 8.4.5	Error handling and validation
      * Registering the JSR-303 validator
      * Adding JSR-303 validation annotations
      * Adding error handling on the client
  * 8.5	Making use of custom Locator and Service Locators (the “long way”)
    * 8.5.1	Creating a custom Locator
    * 8.5.2	Creating a custom Service Locator
      * Implementing a service class external to the domain class
      * Creating the ServiceLocator
      * Hooking in the ServiceLocator
  * 8.6	Summary

## Chapter 9: The Editor Framework ##
  * 9.1	Framework and Editor Overview
    * 9.1.1	Local Domain Object
    * 9.1.2	Remote Domain Objects
  * 9.2	Examining the chapter’s examples
  * 9.3	Editor types
  * 9.4	Constructing our first editor
    * 9.4.1	Defining Local domain object
    * 9.4.2	Defining the Editor
      * Declaring the Editor
      * Constructing the Editor class body
      * Using our Editor
    * 9.4.3	Alternate way to construct an Editor
  * 9.5	Binding our editor with drivers
    * 9.5.1	EmployeeEditor with SimpleBeanEditorDriver
    * 9.5.2	EmployeeEditor with RequestFactoryEditorDriver
  * 9.6	Editor sub-interfaces
    * 9.6.1	Accessing the backing framework services
    * 9.6.2	Editors with error handling
    * 9.6.3	Editing immutable objects
    * 9.6.4	Building customized Editor behavior
    * 9.6.5	Handling subeditors of the same type
  * 9.7	Adapters
    * 9.7.1	Editing a range of domain object
    * 9.7.2	Adapt a list of objects with associated Editors
    * 9.7.3	Adapters for single domain objects
  * 9.8	Summary


## Chapter 10: Data Presentation Widgets ##
  * 10.1	Understanding Cells
    * 10.1.1	Looking at Display Cells
    * 10.1.2	Updating Edit Cells
      * Managing pending updates
    * 10.1.3	Reacting with Action Cells
  * 10.2	Creating Custom Cells
    * 10.2.1	Composite
      * Altering how CompositeCell lays out cells
    * 10.2.2	From first principles
      * Rendering via SafeHtmlBuilder
      * Rendering HTML via SafeHtmlTemplates
      * Rendering HTML via UiBinder
      * Handling Events
      * Handling Events in UiBinder
  * 10.3	Cell widgets
    * 10.3.1	Getting the Cell Context
    * 10.3.2	Providing the Key
  * 10.4	CellList
    * 10.4.1	Creating a Cell List
    * 10.4.2	Populating Data
      * ListDataProvider
      * AsyncDataProvider
    * 10.4.3	Paging
    * 10.4.4	Handling User Updates
    * 10.4.5	Managing data selection with Selection Models
    * 10.4.6	Managing the keyboard
  * 10.5	CellTree
    * 10.5.1	Building TreeViewModels
      * Opening a new node (with Asynchronous data provider)
      * Determining if we’re in the leaves
  * 10.6	CellBrowser
    * 10.6.1	Paging in CellBrowser
  * 10.7	CellTable
    * 10.7.1	Creating a Table
    * 10.7.2	Applying Headers and Footers
    * 10.7.3	Sorting the view
      * With an Asynchronous DataProvider
      * With an List DataProvider
  * 10.8	DataGrid
    * 10.8.1	Custom Cell Table building
      * Building standard rows
      * Building alternative rows (e.g. expanded data)
  * 10.9	Summary


## Chapter 11: Using JavaScript Native Interface (JSNI) ##
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

## Chapter 12:  Classic AJAX and HTML Forms ##
  * 12.1	Understanding the underlying technology
    * 12.1.1	Understanding how HTTP works
    * 12.1.2	Understanding Ajax and the XMLHttpRequest object
    * 12.1.3	Understanding JSON
    * 12.1.4	Solving same site origin issues with JSONP
  * 12.2	Using RequestBuilder
  * 12.3	Posting Data with RequestBuilder
  * 12.4	Using the JSON API and JsonpRequestBuilder
  * 12.5	Using JSON with JS Overlay
  * 12.6	Using the XML API and RequestBuilder
    * 12.6.1	Developing a server-side proxy
    * 12.6.2	Calling the proxy from GWT
    * 12.6.3	Parsing XML content
  * 12.7	Using FormPanel
    * 12.7.1	Designing FormPanel registration form with UIBinder
    * 12.7.2	Adding behavior to the FormPanel
  * 12.8	Summary


## Chapter 13: Internationalization, Localization and Accessibility ##
  * 13.1	Making a user feel comfortable
    * 13.1.1	What is a Locale?
    * 13.1.2	Setting up to use Internationalization.
      * Encoding project files in UTF-8 format
      * Letting the Browser know
    * 13.1.3	The three types of GWT Internationalization
  * 3.2	Using Static String Internationalization
    * 13.2.1	The basics
    * 13.2.2	The Localizable interface
    * 13.2.3	Localizable Annotations
      * Annotation: @Key
      * Annotation: @Meaning
      * Annotation: @Description
    * 13.2.4	Internationalizing Constants
      * Simple Constants
      * Complex constants
      * Annotation: @DefaultxxxxValue
    * 13.2.5	Constants with lookup
    * 13.2.6	Messaging the User
      * Message Parameter format
      * Annotation: @Optional
      * AnnotatIon: @DefaultMessage
      * Handling lists of values
    * 13.2.7	Dealing with Plurals
      * Annotation: @PluralCount
      * Annotation: @AlternateMessage
      * Exact Values in Pluralization
    * 13.2.8	Selecting an Alternate Message based on a user defined value
      * Annotation: @Select
    * 13.2.9	Securing against hack attacks
  * 13.3	Using Static String i18n with UIBinder
  * 13.3.1	Constants with UIBinder
    * 13.3.2	Parameterized Messages with UIBinder
  * 13.4	Determining the locale for Static String Internationalization
    * 13.4.1	Where to find the locale?
    * 13.4.2	Searching the URL
    * 13.4.3	Digesting a Cookie
    * 13.4.4	Finding a HTML Meta Tag
    * 13.4.5	Letting the browser decide
  * 13.5	Internationalizing Client Bundles through Static Internationalization
  * 13.6	Dynamic String Internationalization
    * 13.6.1	The basics.
    * 13.6.2	Enhancing the standard approach
    * 13.6.3	Using with UIBinder.
  * 13.7	Localization of Dates, Times and Currencies
    * 13.7.1	Displaying Numbers and Currency Values
    * 13.7.2	Displaying Times and Dates
  * 13.8	Displaying the right direction
  * 13.9	Accessibility
    * 13.9.1	Using alt text for images
    * 13.9.2	Setting up tab index
    * 13.9.3	Establishing Keyboard shortcuts
    * 13.9.4	Providing Alternative styling
    * 13.9.5	Using ARIA
  * 13.10	Summary

## Chapter 14: Advanced Events and EventBus ##
  * 14.1	Understanding Events
    * 14.1.1	Native events
    * 14.1.2	Logical Events
  * 14.2	How GWT manages events
    * 14.2.1	Dealing with browser differences
      * Event Bubbling
      * Event Capturing
      * The GWT view
    * 14.2.2	Preventing event propagation
    * 14.2.3	Sinking Events
    * 14.2.4	Event Handling Efficiency
  * 14.3	Previewing and Cancelling events
  * 14.4	Preventing default actions
  * 14.5	Programmatically Firing Events
  * 14.6	Creating our own Events
    * 14.6.1	Defining our own Event
    * 14.6.2	Providing the related Interfaces
  * 14.7	Event Buses
    * 14.7.1	What is it
    * 14.7.2	Types of event buses
    * 14.7.3	Using SimpleEventBus
  * 14.8	Summary

## Chapter 15: Building MVP Applications ##
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

## Chapter 16: Dependency Injection ##
  * 16.1	What is Dependency Injection (DI)
  * 16.2	The Fundamentals
    * 16.2.1	At the beginning of time….
    * 16.2.2	Straight from the Factory
    * 16.2.3	Automatically Injecting Dependencies
  * 16.3	Guice – A Java Dependency Injection Framework
    * 16.3.1	Defining the dependencies
    * 16.3.2	Types of injection
      * On-Demand injection
      * Constructor Injection
      * Method injection
      * Field injection
      * Providing the injection
  * 16.4	GIN - How DI Differs in a GWT Application
    * 16.4.1	Setting up for GIN
    * 16.4.2	Defining the dependencies
    * 16.4.3	Bootstrapping the injection
    * 16.4.4	Types of injection
      * On-demand Injection
      * Constructor Injection
      * Method Injection
      * Field Injection
    * 16.4.5	Simply Swapping Components
  * 16.5	When to Avoid DI
  * 16.6	Summary

## Chapter 17: Deferred Binding ##
  * 17.1	What is deferred Binding
    * 17.1.1	Storing Implementation Differences in a Java Classes Hierarchy
    * 17.1.2	Identifying the Differences via Deferred Binding Properties
    * 17.1.3	Informing the GWT compiler which class to pick
    * 17.1.4	Telling the GWT Compiler to make a choice
    * 17.1.5	Selecting the right difference (permutation) at run time.
  * 17.2	Pulling it all together
  * 17.3	Using GWT Properties to Drive Deferred Binding
    * 17.3.1	Defining Properties
    * 17.3.2	Extending Properties
    * 17.3.3	Setting Properties
    * 17.3.4	Conditionally setting a property
  * 17.4	Managing Explosive Permutation Numbers
    * 17.4.1	Using Conditional Properties
    * 17.4.2	Using Soft Permutations
  * 17.5	Determining a property value
    * 17.5.1	Directly Setting a property value in module file
    * 17.5.2	Understanding Property Providers
    * 17.5.3	Generating a Property Provider
    * 17.5.4	Defining our own property-provider
    * 17.5.5	Handling failure to get a property value
  * 17.6	Coping when Deferred Binding is not enough
  * 17.7	Summary

## Chapter 18: Automatically Generating Code ##
  * 18.1	What does a Generator Do?
  * 18.2	What can a Generator Do?
    * 18.2.1	Accessing Code
    * 18.2.2	Reading Annotations
    * 18.2.3	Accessing properties
    * 18.2.4	Using resources
    * 18.2.5	Manipulating resources
  * 18.3	Indicating what Generator to use, and when
  * 18.4	Configuration properties
    * 18.4.1	Defining a configuration property
    * 18.4.2	Setting the value of a configuration property
    * 18.4.3	Extending the value of a configuration property
  * 18.5	Pulling it all together
  * 18.6	Preparing  to write a Generator
  * 18.7	Creating our own Generator
    * 18.7.1	The Generator Skeleton
    * 18.7.2	Creating a new type
    * 18.7.3	Writing the new content
    * 18.7.4	Accessing Types through the TypeOracle
    * 18.7.5	Access Properties through the PropertyOracle
    * 18.7.6	Accessing Resources through the ResourceOracle
    * 18.7.7	Logging in the Generator
  * 18.8	Using our new Generator
  * 18.9	Summary

## Chapter 19: Metrics and Code Splitting ##
  * 19.1	Using the Lightweight Metrics tool
    * 19.1.1 Defining Lightweight Metrics
    * 19.1.2 Writing the Global Collector
      * Understanding the composition of an event
      * Implementing the Global Collector
      * Altering the Global Collector for use with Firebug
      * Altering the Global Collector to calculate elapsed time
    * 19.1.3 Sending events to the Global Collector
      * Creating an event logger
      * Using the Debug Panel for GWT
  * 19.2	Using the Compile Report
    * 19.2.1 Turning on the Compile Report
    * 19.2.2 Understanding the permutation list
    * 19.2.3 Digging into the permutation details
      * Viewing the breakdown analysis
      * Understanding the Strings report
      * Understanding the Classes report
      * Understanding the Method Dependencies report
  * 19.3	Making use of code splitting
    * 19.3.1 Understanding code splitting basics
    * 19.3.2 Using the Async Package pattern
      * Isolating collaborating classes
      * Creating the gateway
      * Using the gateway class
    * 19.3.3 Reducing left-over code by specifying load order
  * 19.4	Summary