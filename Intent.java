Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-0000-0000"));
startActivity(intent);

Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:010-0000-0000"));
startActivity(intent);

Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
startActivity(intent);

Intent intent = new Intent(getApplicatonContext(), LaunchedActivity.class);
startActivity(intent);
