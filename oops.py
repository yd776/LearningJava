# Online Python compiler (interpreter) to run Python online.
class Point:
    def __init__(self,a=0,b=0):
        self.x=a
        self.y=b
        
    def translate(self,dx,dy):
        self.x+=dx
        self.y+=dy
    
    def odistance(self):
        import math
        d=math.sqrt(self.x*self.x+self.y*self.y)
        
        return d
        
        #abstraction user cannot know wheather we are using x y or r theta
        #we can select polar representation as well 
        #interanly we are still the same 
        #direct assignment is not possible in python that i cannot have difffernt classes with the same name 
class Rectangle:
    def __init__(self,w=0,h=0):
        self.width=w
        self.height=h
        
        
        
    def area(self):
        return (self.width*self.height)
    
    def perimeter(self):
        return (2*self.width+self.height)
        
    #example of subtyping square ia a type of rectangle
    
class square(Rectangle):#created a new class of type rectangle which is a subset and it will inherit all the funcions in the rectangle class
    def __init__(self,s=0):
        self.width=s
        self.height=s
    #idea of inheritance is that when we create an object of type square of value 5 it will take the function of rectangle this is a feature of inheritance 

p=Point(5,7)

print(p.odistance()) #returns the ordinal diatnce of object p in 5,7

s=Rectangle(3,3)
print(s.area())

k=square(2)#creating object of abstract data type 
print(k.area())
    
     
        
  
