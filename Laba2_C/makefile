.PHONY: clean

Laba2: main.o input.o search.o output.o array.h
	gcc main.o input.o search.o output.o -o Laba2
search.o: search.c array.h
	gcc -c search.c -o search.o
input.o: input.c array.h
	gcc -c input.c -o input.o
output.o: output.c array.h
	gcc -c output.c -o output.o
main.o: main.c array.h
	gcc -c main.c -o main.o

clean:
	rm -rf Laba2 *.o

