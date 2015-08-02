# Chapter 10 Data Presentation Widgets #

This is a comprehensive chapter that covers all aspects of GWT's Data Presentation (Cell) widgets including GWT 2.5 functionality.





The aim is to arrive at a widget such as the following:

![http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/cellwidgets.png](http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/cellwidgets.png)

which shows custom building of inserted rows on events in the grid, data retrieved from asynchronous server calls, sorting and a variety of cells, together with a pager.

To get there the chapter goes through a number of steps.

## Cell Types ##
We look at the different types of Cells GWT provides as standard (presentation, editing and action types) and then explore how to create our own types of cells - composite and custom.

![http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/celltypes.png](http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/celltypes.png)

The end point is an understanding of cells, events and how to create our own cells.

The section includes how to create cells declaratively using the GWT 2.5 approach to UiBinder.

## Cell Widgets ##
With a good background on cells in the bag, the 2nd half of the chapter moves on to Cell Widgets.

### Cell List ###
Using the declarative custom cell created in the 1st half of the chapter we investigate CellList.

![http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/celllist.png](http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/celllist.png)

With this simpler of cell widgets we can examine List and Async (from the server) data providers as well as paging, handling user updates on cells in a column and how to apply selection models.

### Cell Tree ###
The CellTree requires an understanding of the TreeViewModel, which is obvious once you've done one of them but often quite frustrating if it is your first time.

![http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/celltree.png](http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/celltree.png)

We look at how to implement both a List based model (of the type you can find on a google search) and an Async one where data is retrieved from the server (this is both more practical and real life, but is rarely described)

### Cell Browser ###
This uses the same TreeViewModel as a CellTree, but building the widget is slightly different (in GWT 2.5).

![http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/cellbrowser.png](http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/cellbrowser.png)

We look at how to build one, and how to change the paging model the GWT 2.5 way.

### Cell Table ###
We look at how to implement a simple table that grabs data either from local List or Asynchronously from server calls.

![http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/celltable.png](http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/celltable.png)

This widget gives us an opportunity to consider sorting data and how that is implemented; creation of columns and how to save data back to the source when updates are made.

### Data Grid ###
DataGrid is similar to CellTable and our main purpose here is to investigate the implementation of a custom renderer.

![http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/cellwidgets.png](http://gwtinaction2.googlecode.com/svn/wiki/images/ch10/cellwidgets.png)

That custom renderer allows us to handle events such as clicking on the "Edit Tags" button to expand a set of rows holding tags.  You could also use the custom renderer to draw rows that span multiple columns etc.

# Book's Chapter Content #

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


[<-- Ch9 Editor Framework](EditorFramework.md)<pre></pre>[Ch11 Data Using JSNI -->](JSNI.md)