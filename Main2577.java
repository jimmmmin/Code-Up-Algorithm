 p a c k a g e   a l g o r i t h m ;  
 i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
  
  
 p u b l i c   c l a s s   M a i n 2 5 7 7   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s ) {  
  
 	 	 i n t   c o u n t [ ]   =   n e w   i n t [ 1 0 ] ;  
 	 	 S c a n n e r   s c a n n e r   =   n e w   S c a n n e r ( S y s t e m . i n ) ;  
 	 	 	 i n t   a   =   s c a n n e r . n e x t I n t ( ) ;  
 	 	 	 i n t   b   =   s c a n n e r . n e x t I n t ( ) ;  
 	 	 	 i n t   c   =   s c a n n e r . n e x t I n t ( ) ;  
 	 	 	  
 	 	 	 l o n g   r e s u l t   =   a * b * c ;  
 	 	 	 w h i l e ( r e s u l t > 0 )   {  
 	 	 	 	 f o r ( i n t   k = 0 ; k < 1 0 ; k + + )   {  
 	 	 	 	 	 i f ( ( r e s u l t % 1 0 ) = =   k )   {  
 	 	 	 	 	 	 c o u n t [ k ] + + ;  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 	 r e s u l t   / =   1 0 ;  
 	 	 	 }  
 	 	 	  
 	 	 f o r ( i n t   j = 0 ; j < 1 0 ; j + + )   {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( c o u n t [ j ] ) ;  
 	 	 }  
 	 }  
 }