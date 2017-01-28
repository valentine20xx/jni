#include <jni.h>
#include <stdio.h>
#include "HelloJNI.h"

JNIEXPORT void JNICALL Java_HelloJNI_sayHello(JNIEnv* env, jobject thisObj) {
	printf("Hello World!!!\n");
	return;
}

JNIEXPORT jint JNICALL Java_HelloJNI_add(JNIEnv* env, jobject thisObj, jint a, jint b){
	jint r = a + b;
	return r;
}