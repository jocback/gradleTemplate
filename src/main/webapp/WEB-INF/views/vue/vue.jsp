<%--
  Created by IntelliJ IDEA.
  User: jaehoonyoun
  Date: 2022/08/09
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<div class="col-sm-offset-3 col-sm-9 col-md-10 col-md-offset-2 main">
    <a href="https://kr.vuejs.org/v2/guide/index.html">https://kr.vuejs.org/v2/guide/index.html</a> 참고

    <div id="app">
        {{message}}
    </div>

    <script>
        var app = new Vue({
            el: '#app',
            data: {
                message: '안녕하세요 Vue'
            }
        })
    </script>


    <div id="app-2">
		<span v-bind:title="message">
			내 위에 잠시 마우스를 올리면 동적으로 바인딩 된 title을 볼 수 있습니다!
		</span>
    </div>

    <script>
        var app2 = new Vue({
            el: '#app-2',
            data: {
                message: '이 페이지는 ' + new Date() + ' 에 로드 되었습니다'
            }
        })
    </script>


    <div id="app-3">
        <p v-if="seen">이제 나를 볼 수 있어요</p>
    </div>

    <script>
        var app3 = new Vue({
            el: '#app-3',
            data: {
                seen: true
            }
        })
    </script>


    <div id="app-4">
        <ol>
            <li v-for="todo in todos">
                {{todo.text}}
            </li>
        </ol>
    </div>
    <script>
        var app4 = new Vue({
            el: '#app-4',
            data: {
                todos: [
                    {text: 'JavaScript 배우기'},
                    {text: 'Vue 배우기'},
                    {text: '무언가 멋진 것을 만들기'}
                ]
            }
        })
    </script>


    <div id="app-5">
        <p>{{ message }}</p>
        <button v-on:click="reverseMessage">메시지 뒤집기</button>
    </div>
    <script>
        var app5 = new Vue({
            el: '#app-5',
            data: {
                message: '안녕하세요! Vue.js!'
            },
            methods: {
                reverseMessage: function () {
                    this.message = this.message.split('').reverse().join('')
                }
            }
        })
    </script>


    <div id="app-6">
        <p>{{ message }}</p>
        <input v-model="message">
    </div>
    <script>
        var app6 = new Vue({
            el: '#app-6',
            data: {
                message: '안녕하세요 Vue!'
            }
        })
    </script>


    <div id="app-7">
        <ol>
            <!--
              이제 각 todo-item 에 todo 객체를 제공합니다.
              화면에 나오므로, 각 항목의 컨텐츠는 동적으로 바뀔 수 있습니다.
              또한 각 구성 요소에 "키"를 제공해야합니다 (나중에 설명 됨).
             -->
            <todo-item
                    v-for="item in groceryList"
                    v-bind:todo="item"
                    v-bind:key="item.id"
            ></todo-item>
        </ol>
    </div>
    <script>
        Vue.component('todo-item', {
            props: ['todo'],
            template: '<li>{{ todo.text }}</li>'
        })

        var app7 = new Vue({
            el: '#app-7',
            data: {
                groceryList: [
                    {id: 0, text: 'Vegetables'},
                    {id: 1, text: 'Cheese'},
                    {id: 2, text: 'Whatever else humans are supposed to eat'}
                ]
            }
        })
    </script>


</div>
