// 1. Intent를 이용해 전화 Dialer로 이동
Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-0000-0000"));
startActivity(intent);

// 2. Intent를 이용해 바로 직접 전화가 걸림
// 이 코드를 실행하기 위해서는 AndroidManifest.xml에 다음과 같은 퍼미션을 추가해야 함
// <uses-permission android:name="android.permission.CALL_PHONE"/>
// 해당 퍼미션을 추가할 때에는 AndroidManifest.xml의 application태크 위에 추가 함
Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:010-0000-0000"));
startActivity(intent);

// 3. Intent를 이용해 해당 URI로 인터넷브라우저를 통해 이동
// 이 코드를 실행하기 위해서는 AndroidManifest.xml에 다음과 같은 퍼미션을 추가해야 함
// <uses-permission android:name="android.permission.INTERNET"/>
// 해당 퍼미션을 추가할 때에는 AndroidManifest.xml의 application태크 위에 추가 함
Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
startActivity(intent);

// 4. Intent를 이용해 다른 Activity로 이동
// 이 코드를 실행하기 위해서는 AndroidManifest.xml에 다음과 같은 코드를 추가해야 함
// <activity android:name="LaunchedActivity" />
Intent intent = new Intent(getApplicatonContext(), LaunchedActivity.class);
startActivity(intent);
