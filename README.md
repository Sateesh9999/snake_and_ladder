# snake_and_ladder
this is a personal projet done by me for learning purpose using awt and swing
I have provided the source code of the ptoject which is "Demo1.java" and images are also uploaded
Files with jpg,png are the image files download them along with the source code and store them in a single folder to exicute the program
Or simply can download the compiled files(with .class extension) to run with out compilation also save class files and image files in same folder
logic I used for this project is to take total(position number on board) and 2Darray method to get the correct locarion on board.
 if total%10==0 do:
            a=total/10-1
            b=10
 else do:
            a=total/10
            b=total%10
            
  if c==1 do:
            if a%2!=0 do:
                x1=920-(b*70)
            
            else do:
                x1=160+(b*70)
            

            y1=630-(a*70)
            c=2

        
  else do:
            if  a % 2 != 0 do:
                x2 = 920 - (b * 70)
            
            else do:
                x2 = 160 + (b * 70)
            

            y2 = 670 - (a * 70)
            c = 1
This algorithm helps find the position of the number(total) on board
it finds the location for player1 and player2 individually using variable c.
