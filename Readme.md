Authors: Arash Esfandiari, Josh McCaskil
Date: Winter 2022
Course: CIS*4650, Compilers, University of Guelph

Description:

    The goal of this project is to write a compiler for a new a 
    new programming language called "cminus". This program is build upon
    the SampleParser provided by Professor Fei Song for the purpose of this course. 

    In the first checkpoint, we use the JFLEX scannerin combination with 
    Construction of Useful Parsers (CUP) an LALR parser generator for Java, 
    to scan, tokenize, parse, and finally build a syntaxtree for our newly created program.


Semantic errors caught:
    - Catches invalid operation 
    - Catches invalid if test 
    - Catches invalid void declaration (void x[])
    - Catches variable redeclaration in the same scope
    - Catches invalid call to undifines function
    - Catches invalid use of undeclared variable