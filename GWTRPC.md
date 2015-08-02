# Chapter 7 Communicating with GWT-RPC #

GWT-RPC gives tight binding between client and server side code which can be useful.

This chapter's example uses GWT-RPC to allow the user interface to communicate with Twitter's servers (which can't be done directly as there are single site origin issues)





<img src='https://gwtinaction2.googlecode.com/svn/wiki/images/ch07/Chapter%207%20twitter.png' width='600px' />

The client talks to the server, and the server uses the Twitter4J library to talk to Twitter.  Messages come back from Twitter to the server and are then forwarded to the client.

# Book's Chapter Content #

[<-- Ch6 Interface using UiBinder](UiBinder.md)<pre></pre>[Ch 8 Using RequestFactory -->](RequestFactory.md)