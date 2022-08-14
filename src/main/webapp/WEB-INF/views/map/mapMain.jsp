<%--
  Created by IntelliJ IDEA.
  User: jaehoonyoun
  Date: 2022/07/13
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    #map img {
        max-width: none;
        height: auto;
        border: 0;
        -ms-interpolation-mode: bicubic;
    }
</style>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=26faddbaa5c5f513af69537a4117eef7&libraries=services,clusterer,drawing"></script>
<div class="col-sm-offset-3 col-sm-9 col-md-10 col-md-offset-2 main">
        <div id="map" class="col-sm-11" style="height: 600px; ">
        </div>
</div>