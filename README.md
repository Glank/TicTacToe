<h1>
<br>Software Design Description (SDD)</br>
<br>Tic-Tac-Toe Game</br>
</h1>
<br>Date: May 14th, 2013</br>
<br>Ernest Kirstein</br>
<br>Yuxiang Guo</br>
<p class="c5 c12">
	<span></span>
</p>
<hr style="page-break-before:always;display:none;">
<p class="c5 c12">
	<span></span>
</p>
<h1 class="c5"><a name="h.9jri1dprog68"></a><span>Table Of Contents</span></h1>
<p class="c9">
	<span class="c0"><a class="c3" href="#h.9jri1dprog68">Table Of Contents</a></span>
</p>
<p class="c9">
	<span class="c0"><a class="c3" href="#h.7jb7y24pyeoi">1 - Scope (Yuxiang)</a></span>
</p>
<p class="c2">
	<span class="c0"><a class="c3" href="#h.kb8c6fe18052">1.1 - Identification (Yuxiang)</a></span>
</p>
<p class="c2">
	<span class="c0"><a class="c3" href="#h.41c942h0vnxy">1.2 - System Overview (Yuxiang)</a></span>
</p>
<p class="c2">
	<span class="c0"><a class="c3" href="#h.o1sfg6tjghgu">1.3 - Document Overview (Yuxiang)</a></span>
</p>
<p class="c9">
	<span class="c0"><a class="c3" href="#h.pm3cmp4oxt7y">2 - Reference Documents (All)</a></span>
</p>
<p class="c9">
	<span class="c0"><a class="c3" href="#h.6j2vhxt3l8zb">3 - System Wide Design Decisions (Yuxiang)</a></span>
</p>
<p class="c9">
	<span class="c0"><a class="c3" href="#h.wtbwsafph973">4 - System Architecture Design (Ernest)</a></span>
</p>
<p class="c2">
	<span class="c0"><a class="c3" href="#h.xmtljrd63mq6">4.1 - ttt.model Package Design</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.x120fcm3jlt3">4.1.1 - GameState (Ernest)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.oygz7nwlwl8v">4.1.2 - Player (Yuxiang)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.v5jyfnqu6zsn">4.1.3 - Move (Yuxiang)</a></span>
</p>
<p class="c2">
	<span class="c0"><a class="c3" href="#h.smskl0txwm6w">4.2 - ttt.view Package Design</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.boo4oqi8j2gy">4.2.1 - TicTacToeFrame (Ernest)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.969s09cl99um">4.2.2 - BoardPanel (Ernest)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.58qs6qtvvxxu">4.2.3 - HTMLDisplayDialog (Ernest)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.chvm8pva1zl2">4.2.4 - NewGameDialog (Ernest)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.ho4o1onukdwx">4.2.5 - PlayerSelectPanel (Ernest)</a></span>
</p>
<p class="c2">
	<span class="c0"><a class="c3" href="#h.mgvxyq3kz6vo">4.3 - ttt.controller Package Design</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.d668avog6new">4.3.1 - Main (Yuxiang)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.7h8gstdr3fzt">4.3.2 - GameFlowController (Ernest)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.ng5mkyb2pw5p">4.3.3 - AI (Ernest)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.mp227gdstnq">4.3.4 - NewGameListener (Ernest)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.rgnvh0o8inro">4.3.5 - MenuBarListener (Ernest)</a></span>
</p>
<p class="c11 c13">
	<span class="c0"><a class="c3" href="#h.dxaup43fuq09">4.3.6 - BoardClickListener (Ernest)</a></span>
</p>
<p class="c2">
	<span class="c0"><a class="c3" href="#h.s12ha3ou3lx2">4.4 - Concept of Execution (Yuxiang)</a></span>
</p>
<p class="c9">
	<span class="c0"><a class="c3" href="#h.va8w658hu8j4">5 - Fundamental Models (Yuxiang)</a></span>
</p>
<p class="c2">
	<span class="c0"><a class="c3" href="#h.mov2xip2jlcd">5.1 - Failure Model (Yuxiang)</a></span>
</p>
<p class="c9">
	<span class="c0"><a class="c3" href="#h.3t61slqkbxqx">6 - Glossary (Yuxiang)</a></span>
</p>
<p class="c9">
	<span class="c0"><a class="c3" href="#h.v96clys5myg8">7 - Notes (All)</a></span>
</p>
<p class="c12 c11 c16">
	<span></span>
</p>
<p class="c5 c12">
	<span></span>
</p>
<hr style="page-break-before:always;display:none;">
<p class="c5 c12">
	<span></span>
</p>
<h1 class="c5"><a name="h.7jb7y24pyeoi"></a><span>1 - Scope (Yuxiang)</span></h1>
<h2 class="c5"><a name="h.kb8c6fe18052"></a><span>1.1 - Identification (Yuxiang)</span></h2>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;This document is the first version of Software Design Description (SDD, for short) for the Tic-Tac-Toe Game, and it</span><span>&nbsp;provides the description of Tic-Tac-Toe Game (ttt, for short) at the application level. The Tic-Tac-Toe Game is a small PC game that can be played by one or two players. This document shows the details of this application and the relationships between the application packages.</span>
</p>
<h2 class="c5"><a name="h.41c942h0vnxy"></a><span>1.2 - System Overview (Yuxiang)</span></h2>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The Tic-Tac-Toe Game is a PC application that can be played by one or two players. It shall use a Model-View-Controller architecture. The Model-View-Controller architecture shall contains three application packages: &nbsp;view, controller and model; and the three application packages shall be connected to each other. Through the three application packages, the player shall select the types of game (PVE or PVP), start a new game, and play the game on a board panel. At the same time, the application shall record the player&rsquo;s information, handel all actions and provide varying levels of artificial intelligence PVE. </span>
</p>
<h2 class="c5"><a name="h.o1sfg6tjghgu"></a><span>1.3 - Document Overview (Yuxiang)</span></h2>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Section 1: provides the identification information of document and the system overview.</span>
</p>
<p class="c5 c10">
	<span>Section 2: identifies the documents that are referenced within this document.</span>
</p>
<p class="c2 c7">
	<span>Section 3: provides the design decisions that shall be applied to the Tic-Tac-Toe Game across the entire project.</span>
</p>
<p class="c2 c7">
	<span>Section 4: provides architecture design of the application and internal interfaces among the three application packages.</span>
</p>
<p class="c2 c7">
	<span>Section 5: provides the fundamental models of the solutions that explain and justify the design decisions.</span>
</p>
<h1 class="c5"><a name="h.pm3cmp4oxt7y"></a><span>2 - Reference Documents (All)</span></h1>
<ol class="c15" start="1">
	<li class="c2 c7 c14"><span>Wikipedia - For help developing the artificial intelligence.<br>
	</span><span class="c0"><a class="c3" href="http://en.wikipedia.org/wiki/Minimax">http://en.wikipedia.org/wiki/Minimax</a></span></li>
	<li class="c2 c14 c7"><span class="c0"><a class="c3" href="http://bluehawk.monmouth.edu/~btepfenh/Courses/SE505/Sections/applicationdesign.html">http://bluehawk.monmouth.edu/~btepfenh/Courses/SE505/Sections/applicationdesign.html</a></span><span>&nbsp;- For designing the Tic-Tac-Toe Game at the application level.</span></li>
	<li class="c2 c14 c7"><span class="c0"><a class="c3" href="http://docs.oracle.com/javase/tutorial/">http://docs.oracle.com/javase/tutorial/</a></span><span>&nbsp;- For Java Programming.</span></li>
</ol>
<h1 class="c5"><a name="h.6j2vhxt3l8zb"></a><span>3 - System Wide Design Decisions (Yuxiang)</span></h1>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>In this design, there are several design decisions that apply across the entire project. They are listed as following:</span>
</p>
<p class="c5 c12">
	<span></span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1. The Tic-Tac-Toe Game will be supported by the following operating systems of PC:</span>
</p>
<p class="c2 c10">
	<span>Windows XP/Vista/7/8</span>
</p>
<p class="c2 c10">
	<span>Linux Kernel version 2.4 and higher</span>
</p>
<p class="c2 c10">
	<span>Mac OS X 10.4 (Tiger)</span>
</p>
<p class="c2">
	<span>2. All user interfaces shall be easy and clear to guide the customers to operate them and get the related information.</span>
</p>
<p class="c2">
	<span>3. All contents of the Tic-Tac-Toe Game shall follow the local laws.</span>
</p>
<p class="c2">
	<span>4. The Tic-Tac-Toe Game shall support up to 2 players to use at the same time.</span>
</p>
<p class="c2">
	<span>5. The Tic-Tac-Toe Game shall respond quickly when the player operates them.</span>
</p>
<p class="c12 c11">
	<span></span>
</p>
<p class="c11 c10">
	<span>These design decisions shall be propagated to all components for which the decision is relevant.</span>
</p>
<p class="c4">
	<span></span>
</p>
<hr style="page-break-before:always;display:none;">
<p class="c4">
	<span></span>
</p>
<h1 class="c5"><a name="h.wtbwsafph973"></a><span>4 - System Architecture Design (Ernest)</span></h1>
<p class="c5 c8">
	<img height="497" src="images/image01.png" width="581">
</p>
<p class="c5 c8">
	<span>Figure 4.1 (Ernest)</span>
</p>
<p class="c5 c10">
	<span>This system will use a Model-View-Controller architecture. The Model for this TicTacToe game includes a mutable GameState which has two Player&rsquo;s. The Model also contains a simple Move class for storing row-column pairs. The View for this system has</span><span>&nbsp;a main TicTacToeFrame which contains the other instantiated objects of this package. The BoardPanel displays the GameState for the TicTacToe game. The three dialogs will display information about the system and menus for starting a new game. The Controller contains the Main class as well as the GameFlowController which controls the flow of this turn based game. The Controller also contains the three event listeners which will handle all actions and mouse events which occur in the View. Finally, the Controller contains an AI class which provides varying levels of artificial intelligence for a human player to play against.</span>
	<hr style="page-break-before:always;display:none;">
</p>
<h2 class="c5"><a name="h.xmtljrd63mq6"></a><span>4.1 - ttt.model Package Design</span></h2>
<p class="c5 c8">
	<img height="480" src="images/image05.png" width="560"><span><br>
	Figure 4.1.1 (Ernest)</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;This package contains the Model part of the model-view-controller architecture. The sections below describe the individual classes of this package more completely.</span>
</p>
<h3 class="c5"><a name="h.x120fcm3jlt3"></a><span>4.1.1 - GameState (Ernest)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The GameState class contains all the information about the current state of a Tic Tac Toe game. The </span><span class="c1">squares</span><span>&nbsp;array contains a character value for each square in the Tic Tac Toe board. An empty square is represented by a space character. The </span><span class="c1">player</span><span>&nbsp;array contains the Players, who each have their own specified symbol which is used to fill the </span><span class="c1">squares</span><span>&nbsp;array. The </span><span class="c1">playerTurn</span><span>&nbsp;integer is an index which corresponds to the player in the </span><span class="c1">player</span><span>&nbsp;array whose turn it is. </span><span>The constructor creates an empty Tic Tac Toe board, both Players, and initializes the </span><span class="c1">playerTurn</span><span>&nbsp;index to zero. The </span><span>reseatBoard</span><span>&nbsp;method returns the board to an empty state and resets the </span><span class="c1">playerTurn</span><span>&nbsp;to zero.</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The </span><span class="c1">doMove</span><span>&nbsp;method and the </span><span class="c1">undoMove</span><span>&nbsp;method methods perform and perform a move in the Tic Tac Toe game. They also increment and decrement the </span><span class="c1">playerTurn</span><span>&nbsp;index respectively. These methods expect a valid move but will not throw an error if an invalid move is given. The </span><span class="c1">getMoves</span><span>&nbsp;method returns a </span><span class="c1">java.util.LinkedList</span><span>&nbsp;of all the valid moves that are available at the current game state. The </span><span class="c1">getRandomMove</span><span>&nbsp;method returns a random valid move.</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The </span><span class="c1">getSquare</span><span>&nbsp;and </span><span class="c1">setSquare</span><span>&nbsp;method take row-column integer pairs and a value character as parameters. They provide public access to the </span><span class="c1">squares</span><span>&nbsp;array. The </span><span class="c1">getPlayer</span><span>&nbsp;methods provide access to the </span><span class="c1">players</span><span>&nbsp;array by index and by the character symbol of the desired Player. The methods </span><span class="c1">incrementPlayerTurn</span><span>&nbsp;and </span><span class="c1">decrementPlayerTurn</span><span>&nbsp;do as their name implies but in the modular domain (once </span><span class="c1">playerTurn</span><span>&nbsp;goes past a valid index, it loops back to a valid one). </span>
</p>
<p class="c5 c10">
	<span>The </span><span class="c1">isTie </span><span>method determines whether or not the game is in a tie. The </span><span class="c1">getWinner</span><span>&nbsp;method returns the Player who has won the current game or null if there is no winner or the game is tied. The </span><span class="c1">getLength</span><span>&nbsp;method is used by the </span><span class="c1">getWinner</span><span>&nbsp;method. It returns the length of same continuous Player symbols (not empty spaces) in the vector direction &lt;dr,dc&gt; from the point (r,c).</span>
</p>
<p class="c5 c10">
	<span>The </span><span class="c1">toString</span><span>&nbsp;method provides a command-line-printable string which shows the state of the Tic Tac Toe board.</span>
</p>
<h3 class="c5"><a name="h.oygz7nwlwl8v"></a><span>4.1.2 - Player (Yuxiang)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The </span><span class="c1">Player</span><span>&nbsp;class is applied to manage the player&rsquo;s information. The number of wins and symbol of the player should be got by the methods in the </span><span class="c1">Player</span><span>&nbsp;class. The variables and methods in </span><span class="c1">Player</span><span>&nbsp;class are described as follows:</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="c1">wins</span><span>: integer variable, represents the number of wins;</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="c1">symbol</span><span>: char variable, represents the symbol that is used in the board by the player;</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="c1">Player (symbol: char)</span><span>: constructor, creates a new player, defines the new player&rsquo;s symbol and initializes the number of wins is equal to zero;</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="c1">getWins()</span><span>: obtains the number of wins;</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="c1">addWins()</span><span>: the number of wins is increased 1;</span>
</p>
<p class="c5 c10">
	<span class="c1">getSymbol()</span><span>: obtains the symbol of the player.</span>
</p>
<h3 class="c5"><a name="h.v5jyfnqu6zsn"></a><span>4.1.3 - Move (Yuxiang)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The </span><span class="c1">Move</span><span>&nbsp;class is applied to mark the location of the symbol by the row-column method. The variables and methods in </span><span class="c1">Move</span><span>&nbsp;class are described as follows:</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="c1">row</span><span>: integer variable, represents the row number of the Tic-Tac-Toe board;</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="c1">col</span><span>: integer variable, represents the column number of the Tic-Tac-Toe board;</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="c1">Move (r:int, c:int)</span><span>: constructor, according to the two integer parameters </span><span class="c1">r </span><span>and </span><span class="c1">c</span><span>, this method sets the location of the symbol on Tic-Tac-Toe board.</span>
</p>
<hr style="page-break-before:always;display:none;">
<h2 class="c5 c19"><a name="h.yiojimmiirqg"></a></h2>
<h2 class="c5"><a name="h.smskl0txwm6w"></a><span>4.2 - ttt.view Package Design</span></h2>
<p class="c5 c8">
	<img height="613" src="images/image02.png" width="621">
</p>
<p class="c5 c8">
	<span>Figure 4.2.1 (Ernest)</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;This package contains the View part of the model-view-controller architecture. The sections below describe the individual classes of this package more completely.</span>
</p>
<h3 class="c5"><a name="h.boo4oqi8j2gy"></a><span>4.2.1 - TicTacToeFrame (Ernest)</span></h3>
<p class="c5 c10">
	<span>The TicTacToeFrame (shown in figure 4.2.2) has a menu bar, the BoardPanel, and can open the three dialogs. The final static String values contain the file locations of the help and about HTML files respectively. This class extends java.swing.JFrame. </span>
</p>
<p class="c5 c10">
	<span>The constructor instantiates all of the components, their listeners, and the dialogs. It also, resizes, and centers the frame but it does not make it visible yet. The </span><span class="c1">initMenuBar</span><span>&nbsp;method is called by the constructor to build the menu bar. </span>
</p>
<p class="c5 c10">
	<span>The </span><span class="c1">getBoard</span><span>&nbsp;method returns the </span><span class="c1">board</span><span>&nbsp;variable. The </span><span class="c1">update</span><span>&nbsp;repaints and performs any necessary update functions to make sure the view represents the current GameState. The </span><span class="c1">openNewGameDialog</span><span>, </span><span class="c1">openHelpDialog</span><span>, and </span><span class="c1">openAboutDialog</span><span>&nbsp;methods open the respective dialogs. The </span><span class="c1">announceEnd</span><span>&nbsp;announces the end of a game and displays Player </span><span class="c1">p</span><span>&nbsp;as the winner; if </span><span class="c1">p</span><span>&nbsp;is null, then this method announces a tie. The </span><span class="c1">askPlayAgain</span><span>&nbsp;method prompts the user to play again and returns their choice (true for yes).</span>
</p>
<p class="c5 c8">
	<img height="383" src="images/image00.png" width="512">
</p>
<p class="c5 c8">
	<span>Figure 4.2.2 (Ernest)</span>
</p>
<h3 class="c5"><a name="h.969s09cl99um"></a><span>4.2.2 - BoardPanel (Ernest)</span></h3>
<p class="c5 c10">
	<span>The BoardPanel (see Figure 4.2.2) displays the squares of the GameState. The </span><span class="c1">SQUARE_SIZE</span><span>&nbsp;is 100 pixels. The </span><span class="c1">state</span><span>&nbsp;attribute is a reference to the mutable GameState. The constructor initializes the </span><span class="c1">state</span><span>&nbsp;attribute and adds a new BoardClickListener to this objects mouse event handler list. This class extends javax.swing.JPanel. </span>
</p>
<p class="c5 c10">
	<span>The </span><span class="c1">paint</span><span>&nbsp;method overrides the same method in the superclass; it draws what is shown in figure 4.2.2. The private methods (</span><span class="c1">paintSquare, drawX, drawO</span><span>) are used by the main paint method to draw the board. </span>
</p>
<p class="c5 c8">
	<img height="328" src="images/image04.png" width="611">
</p>
<p class="c5 c8">
	<span>Figure 4.2.3 (Ernest)</span>
</p>
<h3 class="c5"><a name="h.58qs6qtvvxxu"></a><span>4.2.3 - HTMLDisplayDialog (Ernest)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The HTMLDisplayDialog (see Figure 4.2.3) is for displaying simple HTML documents in a stand-alone window. This class is used for the About dialog as well as the Help dialog in this program. Then constructor for the modal HTMLDisplayDialog takes in a file and a title and produces the dialog, but it does not make it visible. The </span><span class="c1">initJEP</span><span>&nbsp;method initializes the </span><span class="c1">jep</span><span>&nbsp;instance variable. The HTMLDisplayDialog extends javax.swing.JDialog.</span>
</p>
<p class="c5 c8">
	<img height="203" src="images/image03.png" width="388">
</p>
<p class="c5 c8">
	<span>Figure 4.2.4 (Ernest)</span>
</p>
<h3 class="c5"><a name="h.chvm8pva1zl2"></a><span>4.2.4 - NewGameDialog (Ernest)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The NewGameDialog (see Figure 4.2.4) is used to set up a new Tic Tac Toe game. The </span><span class="c1">listener</span><span>&nbsp;attribute is applied to the buttons at the bottom of the dialog box. The </span><span class="c1">playerX</span><span>&nbsp;and </span><span class="c1">playerO</span><span>&nbsp;attributes are the left and right complex panels respectively. The NewGameDialog extends javax.swing.JDialog.</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The constructor initializes all of the components and the listener, but does not make the dialog visible. The </span><span class="c1">getButtons</span><span>&nbsp;method is used to initialize the buttons panel. The </span><span class="c1">getXAI</span><span>&nbsp;and </span><span class="c1">getOAI</span><span>&nbsp;methods call the </span><span class="c1">getAI</span><span>&nbsp;method for the </span><span class="c1">playerX</span><span>&nbsp;and </span><span class="c1">playerO</span><span>&nbsp;attributes respectively; so they return either an AI object (for a computer player) or null (for a human player).</span>
</p>
<h3 class="c5"><a name="h.ho4o1onukdwx"></a><span>4.2.5 - PlayerSelectPanel (Ernest)</span></h3>
<p class="c5 c10">
	<span>The PlayerSelectPanel (see Figure 4.2.4) is used to set up a single player (computer or human) for a new game. It has four javax.swing.JRadioButtons which each correspond to a human player or some level of artificial intellegence. There is also an instance variable </span><span class="c1">c</span><span>&nbsp;which corresponds to the symbol (X or O) of this player. PlayerSelectPanel extends javax.swing.JPanel. </span>
</p>
<p class="c5 c10">
	<span>The constructor initializes the radio buttons. The method </span><span class="c1">getAI</span><span>&nbsp;returns null for human, an AI with a depth of 1 for easy, 3 for medium, and 5 for hard. The hard AI cannot be beaten, only tied. </span>
	<hr style="page-break-before:always;display:none;">
</p>
<h2 class="c5"><a name="h.mgvxyq3kz6vo"></a><span>4.3 - ttt.controller Package Design</span></h2>
<p class="c5">
	<img height="449" src="images/image06.png" width="620">
</p>
<p class="c5 c8">
	<span>Figure 4.4.1 (Ernest)</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;This package contains the Controller part of the model-view-controller architecture. The sections below describe the individual classes of this package more completely.</span>
</p>
<h3 class="c5"><a name="h.d668avog6new"></a><span>4.3.1 - Main (Yuxiang)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The </span><span class="c1">Main</span><span>&nbsp;class performs the main function that creates two objects by the </span><span class="c1">GameFlowController</span><span>&nbsp;class and the </span><span class="c1">TicTacToeFrame</span><span>&nbsp;class. Through the </span><span class="c1">Main</span><span>&nbsp;class, all the functions of the Tic-Tac-Toe game should be invoked and performed.</span>
</p>
<h3 class="c5"><a name="h.7h8gstdr3fzt"></a><span>4.3.2 - GameFlowController (Ernest)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The GameFlowController is responsible for triggering AI moves, preventing invalid human moves, and initiating end-game procedures after a tie or a win has occured. The </span><span class="c1">state </span><span>variable contains the game state. The </span><span class="c1">playerX</span><span>, and </span><span class="c1">playerO</span><span>, variables contain the AI for the X and O players respectively; if these values are null then those players are humans. The </span><span class="c1">view</span><span>&nbsp;variable is a reference to the main display frame.</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The constructor initializes the GameState. The </span><span class="c1">setView</span><span>&nbsp;method must be called externally before the view is made visible. The </span><span class="c1">newGame</span><span>&nbsp;method resets the game state, notifies the view, and sets the two AI&rsquo;s. It also attempts to make an AI move, in case the X player is not human. The method </span><span class="c1">getState</span><span>&nbsp;simply returns the </span><span class="c1">state</span><span>&nbsp;variable.</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The method </span><span class="c1">tryPlayMove</span><span>&nbsp;handles all attempted moves from either the AI&rsquo;s or the BoardClickListener. This method guards against invalid human moves and triggers AI moves or end game events when they are applicable. The methods </span><span class="c1">attemptAIMove</span><span>&nbsp;and </span><span class="c1">gameOver</span><span>&nbsp;are called in those two events and handle potential AI moves and game-over events respectively.</span>
</p>
<h3 class="c5"><a name="h.ng5mkyb2pw5p"></a><span>4.3.3 - AI (Ernest)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The AI class handles the artificial intelligence for the computer players using the minimax algorithm (see references). The </span><span class="c1">depth</span><span>&nbsp;variable determines the number of moves ahead to look each turn. The </span><span class="c1">me</span><span>&nbsp;character is the symbol (X or O) of the player that this AI represents. Then constructor passes its parameters to the two instance variables.</span>
</p>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The method </span><span class="c1">getHeuristicValue</span><span>&nbsp;analyzes the given GameState based on it&rsquo;s favorability for the player with the character </span><span class="c1">me</span><span>&nbsp;(with positive values being good and negative values being bad). The method </span><span class="c1">getValue</span><span>&nbsp;implements the minimax algorithm to determine the favorability of a state by looking ahead recursively for the given depth. Finally, the public </span><span class="c1">getMove</span><span>&nbsp;method can be called to retrieve the best-guess Move from this artificial player.</span>
</p>
<h3 class="c5"><a name="h.mp227gdstnq"></a><span>4.3.4 - NewGameListener (Ernest)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The NewGameListener handles the button click events from the NewGameDialog. It is an implementation of the java.awt.ActionListener interface. In the </span><span class="c1">actionPerformed</span><span>&nbsp;method, when an</span><span>&nbsp;&ldquo;OK&rdquo; command is received the method uses the data from it&rsquo;s parent dialog to trigger a new game in the GameFlowController. If any event is received, the method disposes of it&rsquo;s parent.</span>
</p>
<h3 class="c5"><a name="h.rgnvh0o8inro"></a><span>4.3.5 - MenuBarListener (Ernest)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The MenuBarListener handles the menu button click events from the TicTacToeFrame. It is an implementation of the java.awt.ActionListener interface. In the </span><span class="c1">actionPerformed </span><span>method, when an action command is received (&ldquo;New Game&rdquo;, &ldquo;Help&rdquo;, or &ldquo;About&rdquo;) the method opens the dialog which corresponds to that command via it&rsquo;s parent class. </span>
</p>
<h3 class="c5"><a name="h.dxaup43fuq09"></a><span>4.3.6 - BoardClickListener (Ernest)</span></h3>
<p class="c5">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The BoardClickListener handles the mouse clicks from the BoardPanel. It is an implementation of the java.awt.MouseListener interface. In the </span><span class="c1">mouseReleased</span><span>&nbsp;method, the MouseEvent&rsquo;s location is converted into a row-column pair, then a move is attempted via the GameFlowController. The other methods from the MouseListener interface are left empty.</span>
</p>
<h2 class="c5"><a name="h.s12ha3ou3lx2"></a><span>4.4 - Concept of Execution (Yuxiang)</span></h2>
<p class="c11 c10">
	<span>The board panel of the Tic-Tac-Toe Game contains three options: &ldquo;About&rdquo;, &ldquo;Help&rdquo;, &ldquo;New Game&rdquo;. The player shall view the information of the Tic-Tac-Toe Game by the &ldquo;About&rdquo; option, view the solutions of FAQ by the &ldquo;Help&rdquo; option, and start a new game by &ldquo;New Game&rdquo; option. The basic execution process of this application is listed as follow: </span>
</p>
<p class="c11 c12">
	<span></span>
</p>
<p class="c10 c11">
	<span>1. The user shall open the Tic-Tac-Toe Game application on his/her PC.</span>
</p>
<p class="c11">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2. The application shall display a board panel on the screen of PC.</span>
</p>
<p class="c11">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3. The user shall select the &ldquo;New Game&rdquo; option.</span>
</p>
<p class="c2">
	<span>4. The application shall pop up a dialog that lets the user to select the symbol and the type of game (Human or AI).</span>
</p>
<p class="c2">
	<span>5. The user shall select the symbol and the type of game, then click on the &ldquo;OK&rdquo; button.</span>
</p>
<p class="c2">
	<span>6. If the user selects the &ldquo;Human&rdquo; type, the application shall enter into the PVP mode, if the user selects the &ldquo;AI&rdquo; type, the application shall enter into the PVE mode. (In the PVP mode, the application shall be played by two players; and in the PVE mode, the application shall be played by one player.)</span>
</p>
<p class="c2">
	<span>7. The application shall display the squares of the game state on the board panel.</span>
</p>
<p class="c2">
	<span>8. The player shall start the game and place his/her symbol in the squares.</span>
</p>
<p class="c2">
	<span>9. The application shall handle all the actions of player or AI, and estimate who wins.</span>
</p>
<p class="c2">
	<span>10. The application shall display the winner or the tie.</span>
</p>
<p class="c4">
	<span></span>
</p>
<h1 class="c5"><a name="h.va8w658hu8j4"></a><span>5 - Fundamental Models (Yuxiang)</span></h1>
<p class="c5 c10">
	<span>This section of the document describes the fundamental models of how the solution operates.</span>
</p>
<h2 class="c5"><a name="h.mov2xip2jlcd"></a><span>5.1 - Failure Model (Yuxiang)</span></h2>
<p class="c11">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tic-Tac-Toe Game application has two possibilities to fail during it runs. The failure points are described as follow:</span>
</p>
<p class="c12 c11">
	<span></span>
</p>
<p class="c11">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Failure 1: The Tic-Tac-Toe Game application shall not run due to the version of PC operation system is too old. If the version of PC operation system is too old, when the player wants to open the application, the screen of PC shall not display the board panel of the application. Actually, the game application shall not be run by the old PC operation system. For running the Tic-Tac-Toe Game application, the operation system of PC shall not be older than Windows XP, Linux Kernel version 2.4, and Mac OS X 10.4.</span>
</p>
<p class="c12 c11">
	<span></span>
</p>
<p class="c11">
	<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Failure 2: The Java platform doesn&rsquo;t be installed the javax.swing package, the view part of the Tic-Tac-Toe Game application shall not run well. Maybe the board panel of the application shall not be displayed on the screen of PC. For running this application, the java platform must be installed the javax.swing package.</span>
</p>
<p class="c12 c11">
	<span class="c17"></span>
</p>
<h1 class="c5"><a name="h.3t61slqkbxqx"></a><span>6 - Glossary (Yuxiang)</span></h1>
<p class="c11">
	<span>AI - Artificial Intelligence</span>
</p>
<p class="c11">
	<span>PVE - Player vs Enviroment</span>
</p>
<p class="c11">
	<span>PVP - Player vs Player</span>
</p>
<p class="c11">
	<span>PC - Personal Computer</span>
</p>
<p class="c11">
	<span>FAQ - Frequently Asked Question</span>
</p>
