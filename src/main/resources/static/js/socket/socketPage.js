var ws;
var socketPage = {
	username: '',
	init: function(){
		socketPage.username = $("#layout_username").val();
		socketPage.bind();
		socketPage.initSocket();
	},
	bind: function(){
		$("#button-send").on('click', function(){
			socketPage.send();
		});
	},
	send: function(){
		debugger;
		let msg = $("#msg").val();

		console.log(socketPage.username + ":" + msg.value);
		ws.send(socketPage.username + ":" + msg.value);
		msg.value = '';
	},
	initSocket: function() {
		ws = new WebSocket("ws://localhost:8080/ws/chat");

		ws.onopen = function(evt) {
			debugger;
			var str = socketPage.username + ": 님이 입장하셨습니다.";
			ws.send(str);
		}

		ws.onclose = function(evt){
			debugger;
			var str = socketPage.username + ": 님이 방을 나가셨습니다.";
			ws.send(str);
		}

		ws.onmessage = function(msg){
			debugger;
			var data = msg.data;
			var sessionId = null;
			//데이터를 보낸 사람
			var message = null;
			var arr = data.split(":");

			for(var i=0; i<arr.length; i++){
				console.log('arr[' + i + ']: ' + arr[i]);
			}

			var cur_session = socketPage.username;

			//현재 세션에 로그인 한 사람
			console.log("cur_session : " + cur_session);
			sessionId = arr[0];
			message = arr[1];

			console.log("sessionID : " + sessionId);
			console.log("cur_session : " + cur_session);

			//로그인 한 클라이언트와 타 클라이언트를 분류하기 위함
			if(sessionId == cur_session){
				var str = "<div class='col-6'>";
				str += "<div class='alert alert-secondary'>";
				str += "<b>" + sessionId + " : " + message + "</b>";
				str += "</div></div>";
				$("#msgArea").append(str);
			}
			else{
				var str = "<div class='col-6'>";
				str += "<div class='alert alert-warning'>";
				str += "<b>" + sessionId + " : " + message + "</b>";
				str += "</div></div>";
				$("#msgArea").append(str);
			}
		};
	}
}

$(function(){
	socketPage.init();
});