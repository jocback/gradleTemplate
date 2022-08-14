var mapMain = {
    init : function() {
        var mapContainer = document.getElementById("map"), // 지도를 표시할 div
            mapOption = {
                center: new daum.maps.LatLng(37.503043, 126.775960), // 지도의 중심좌표
                level: 5, // 지도의 확대 레벨
                disableDoubleClickZoom: true
            };
        map = new daum.maps.Map(mapContainer, mapOption);
        // map.relayout();
        mapMain.bind();
    },
    bind : function() {

    }
}

$(function(){
   mapMain.init();
});