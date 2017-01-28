output := ../compiled
src := src
jdk_path := C:\Program Files\Java\jdk1.8.0_111
	
all : module
.PHONY : all

clean:
	if exist "$(output)" rd /s /q "$(output)"
	if not exist "$(output)" mkdir "$(output)"
	@echo CLEAN SUCCESS

module:
	gcc -c HelloJNI.c -o $(output)/HelloJNI.o -I"$(jdk_path)\include" -I"$(jdk_path)\include\win32"
	gcc $(output)/HelloJNI.o -shared -o $(output)/hello.dll -Wl,--add-stdcall-alias,--output-def,$(output)/HelloJNI.def,-out-implib,$(output)/HelloJNI.a
	
	@echo MODULE SUCCESS