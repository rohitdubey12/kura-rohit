/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_codeminders_hidapi_HIDManager */

#ifndef _Included_com_codeminders_hidapi_HIDManager
#define _Included_com_codeminders_hidapi_HIDManager
#ifdef __cplusplus
extern "C" {
#endif
/* Inaccessible static: instance */
/*
 * Class:     com_codeminders_hidapi_HIDManager
 * Method:    listDevices
 * Signature: ()[Lcom/codeminders/hidapi/HIDDeviceInfo;
 */
JNIEXPORT jobjectArray JNICALL Java_com_codeminders_hidapi_HIDManager_listDevices
  (JNIEnv *, jobject);

/*
 * Class:     com_codeminders_hidapi_HIDManager
 * Method:    init
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_codeminders_hidapi_HIDManager_init
  (JNIEnv *, jobject);

/*
 * Class:     com_codeminders_hidapi_HIDManager
 * Method:    release
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_codeminders_hidapi_HIDManager_release
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
