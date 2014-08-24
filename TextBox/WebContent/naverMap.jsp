<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko" xmlns:v="urn:schemas-microsoft-com:vml">
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>샘플코드</title>
        
</head>
<body>
<script type="text/javascript" src="http://openapi.map.naver.com/openapi/naverMap.naver?ver=2.0&key=bb95592d8e44402ecee2f8f5fed00a9a"></script>
<div id="map" style="border:1px solid red;" onmouseover="mouseEvent1();"></div>
<script type="text/javascript">
	// 지도 시작위치
	var oSeoulCityPoint = new nhn.api.map.LatLng(37.5344836, 126.9946446);
	var defaultLevel = 11;
	// 지도 기본 설정
	var oMap = new nhn.api.map.Map(document.getElementById('map'), { 
	point : oSeoulCityPoint,
	zoom : defaultLevel,
	enableWheelZoom : true,
	enableDragPan : true,
	enableDblClickZoom : false,
	mapMode : 0,
	activateTrafficMap : false,
	activateBicycleMap : false,
	minMaxLevel : [ 1, 14 ],
	size : new nhn.api.map.Size(800, 480)           });
	
	// - 확대/축소 바
	var oSlider = new nhn.api.map.ZoomControl();	
	oMap.addControl(oSlider);
	oSlider.setPosition({
		top : 10,
		left : 10
	});
	
	// - 맵 선택 버튼(일반/위성)
	var oMapTypeBtn = new nhn.api.map.MapTypeBtn();
	oMap.addControl(oMapTypeBtn);
	oMapTypeBtn.setPosition({
		bottom : 10,
		right : 110  // 80 + 30
	});       
	
	// - 실시간 교통지도 버튼
	var trafficButton = new nhn.api.map.TrafficMapBtn(); 
	trafficButton.setPosition({
		bottom:10, 
		right:180	// 150 + 30
	}); 
	oMap.addControl(trafficButton);
	
	var oSize = new nhn.api.map.Size(28, 37);
	var oOffset = new nhn.api.map.Size(14, 37);
	var oIcon = new nhn.api.map.Icon('http://static.naver.com/maps2/icons/pin_spot2.png', oSize, oOffset);
	var oInfoWnd = new nhn.api.map.InfoWindow();
	oInfoWnd.setVisible(false);
	oMap.addOverlay(oInfoWnd);
	oInfoWnd.setPosition({
		top : 20,
		left :20
	});
	 
	// 마커1 
	var oPoint1 = new nhn.api.map.LatLng(37.5333976, 126.9936107);
	 
	var oMarker1 = new nhn.api.map.Marker(oIcon);  //마커 생성
	
	oMarker1.setPoint(oPoint1); //마커 표시할 좌표 선택
	oMarker1.setTitle("이태원 맛집");
	
	oMap.addOverlay(oMarker1); //마커를 지도위에 표현 
	
	var oLabel1 = new nhn.api.map.MarkerLabel(); // - 마커 라벨 선언. 
	oMap.addOverlay(oLabel1); // - 마커 라벨 지도에 추가. 기본은 라벨이 보이지 않는 상태로 추가됨. 
	oLabel1.setVisible(true, oMarker1); // 마커 라벨 보이기
	
	// 마커2 
	var oPoint2 = new nhn.api.map.LatLng(37.5338039, 126.9936107);
	 
	var oMarker2 = new nhn.api.map.Marker(oIcon);  //마커 생성
	
	oMarker2.setPoint(oPoint2); //마커 표시할 좌표 선택
	oMarker2.setTitle("이태원 쉼터");
	
	oMap.addOverlay(oMarker2); //마커를 지도위에 표현 
	
	var oLabel2 = new nhn.api.map.MarkerLabel(); // - 마커 라벨 선언. 
	oMap.addOverlay(oLabel2); // - 마커 라벨 지도에 추가. 기본은 라벨이 보이지 않는 상태로 추가됨. 
	oLabel2.setVisible(true, oMarker2); // 마커 라벨 보이기
	
	// 마커2 
	var oPoint3 = new nhn.api.map.LatLng(37.5322347, 126.9936107);
	 
	var oMarker3 = new nhn.api.map.Marker(oIcon);  //마커 생성
	
	oMarker3.setPoint(oPoint3); //마커 표시할 좌표 선택
	oMarker3.setTitle("이태원 놀이방");
	
	oMap.addOverlay(oMarker3); //마커를 지도위에 표현 
	
	var oLabel3 = new nhn.api.map.MarkerLabel(); // - 마커 라벨 선언. 
	oMap.addOverlay(oLabel3); // - 마커 라벨 지도에 추가. 기본은 라벨이 보이지 않는 상태로 추가됨. 
	oLabel3.setVisible(true, oMarker3); // 마커 라벨 보이기
		
		// 클릭 이벤트
		oMap.attach('click', function(oEvent) {
			
			// alert('\'' + oEvent.target.getTitle() + '\'' + '페이지로 이동합니다.');
			
			if(oEvent.target.getTitle() == '이태원 맛집') {
				location.href="http://www.naver.com";
			}
			if(oEvent.target.getTitle() == '이태원 쉼터') {
				location.href="http://www.daum.net";
			}
			if(oEvent.target.getTitle() == '이태원 놀이방') {
				location.href="http://www.google.com";
			}
			
		});
	var indexNum = 0;
	function mouseEvent1() {		
		if(indexNum == 0) {
			alert("하나하나 클릭하셔서 좋은 정보 얻어가세요*^^*");
			indexNum = 1;
		}
	}
 
</script>      
<!-- <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script> -->
</body>
</html>