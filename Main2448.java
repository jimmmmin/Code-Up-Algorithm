 p a c k a g e   a l g o r i t h m ;  
 i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
  
 p u b l i c   c l a s s   M a i n 2 4 4 8   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S c a n n e r   s c a n n e r   =   n e w   S c a n n e r ( S y s t e m . i n ) ;  
 	 	 i n t   n   =   s c a n n e r . n e x t I n t ( ) ;  
 	 	 i n t   k   =   ( i n t )   ( M a t h . l o g ( n / 3 ) / M a t h . l o g ( 2 ) ) ;   / / n   =   3   *   2 ^ k  �t���\    
 	 	 S t r i n g   s t [ ]   =   n e w   S t r i n g [ n ] ;  
 	 	 s t a r ( k , s t ) ;  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   v o i d   s t a r ( i n t   k ,   S t r i n g [ ]   s t )   {  
 	 	 s t [ 0 ]   =   "     *     " ;  
 	 	 s t [ 1 ]   =   "   *   *   " ;  
 	 	 s t [ 2 ]   =   " * * * * * " ;  
 	 	 i n t   h e i g h t   =   3 ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ; i < k ; i + + )   {  
 	 	 	 f o r ( i n t   j = 0 ;   j < h e i g h t ; j + + )   {  
 	 	 	 	 s t [ h e i g h t   +   j ]   =   s t [ j ]   +   "   "   +   s t [ j ] ;    
 	 	 	 	 f o r ( i n t   m = 0 ; m < h e i g h t / 3 ; m + + )   {  
 	 	 	 	 	 s t [ j ]   =   "       " +   s t [ j ]   +   "       " ;   / /����  ��ő  �̴�0  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 h e i g h t   + =   h e i g h t ;  
 	 	 }  
 	 	 f o r ( i n t   i = 0 ; i < h e i g h t ; i + + )   {  
 	 	 S y s t e m . o u t . p r i n t l n ( s t [ i ] ) ;  
 	 	 }  
 	 }  
 }  
  
