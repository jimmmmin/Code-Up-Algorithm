 p a c k a g e   a l g o r i t h m ;  
 i m p o r t   j a v a . i o . * ;  
 i m p o r t   j a v a . u t i l . S t r i n g T o k e n i z e r ;  
  
  
 p u b l i c   c l a s s   M a i n 2 4 9 0   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   t h r o w s   I O E x c e p t i o n   {  
 	 	 B u f f e r e d R e a d e r   b r   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( S y s t e m . i n ) ) ;  
 	 	 B u f f e r e d W r i t e r   b w   =   n e w   B u f f e r e d W r i t e r ( n e w   O u t p u t S t r e a m W r i t e r ( S y s t e m . o u t ) ) ;  
 	 	 i n t   k   =   3 ;  
 	 	 c h a r   c [ ]   =   {   ' E '   , ' A ' ,   ' B ' ,   ' C ' ,   ' D '   } ;  
 	 	  
 	 	  
 	 	 w h i l e ( k > 0 )   {  
 	 	 	 i n t   c o u n t   = 0 ;  
 	 	 	 S t r i n g   s   =   b r . r e a d L i n e ( ) ;  
 	 	 	 S t r i n g T o k e n i z e r   s t   =   n e w   S t r i n g T o k e n i z e r ( s ) ;  
 	 	 	 w h i l e ( s t . h a s M o r e T o k e n s ( ) )   {  
 	 	 	 	 i f ( ( s t . n e x t T o k e n ( ) ) . e q u a l s ( " 0 " ) )  
 	 	 	 	 	 c o u n t + + ;  
 	 	 	 }  
 	 	 	 b w . w r i t e ( c [ c o u n t ] ) ;  
 	 	 	 b w . n e w L i n e ( ) ;  
 	 	 	 k - - ;  
 	 	 }  
 	 	  
 	 	 b w . f l u s h ( ) ;  
 	 	 b w . c l o s e ( ) ;  
 	 }  
 }  
