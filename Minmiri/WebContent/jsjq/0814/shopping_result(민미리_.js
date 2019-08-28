    //1. 준비물 목록을 위한 배열 선언
                //이거나 이 밑줄 꺼 둘중 하나 선택해서 쓰면 됨
            //var itemList = new Array(); 
            var itemList = [];
        //2. 버튼의 id를 가져와서 addBtn 객체로 설정
            var addBtn = document.querySelector("#add");
                //쿼리셀렉터 : 아이디나 특정한 클래스 부분들을 가져옴

                //이 둘중 하나만 쓰면 됨.똑같은 기능을 함
            //addBtn.onclick = addList; //클릭을 햇을때 addList를 불러와
            addBtn.addEventListener("click", addList); 
                //addBtn항목에 "click"이라는 이벤트가 들어왔을때  addlist함수가 실행됨
        
        //addlist 함수 구현
        function addList() {
            var item = document.querySelector("item").value;
                //밑에 item을 가져와서 변수 item에 저장함
            console.log(item);
                //브라우저의 개발자 콘솔에서 확인가능한 내용
            if(item !=null){
                //item내용을 itemList 배열에 추가함.
                itemList.push(item);
                //text창의 내용 삭제
                document.querySelector("#item").value = "";
                //포커스를 text창에 남길것, .value = 입력된 값
                document.querySelector("#item").focus(); 
                    //focus에 넣어주겠다 함수처리
            }
            // 준비물 목록을 화면에 출력해줄 것
            showList();
                
        }

        //showList 함수 구현
        function showList() {
            var list = "<ul>";
            for(var i = 0; i<itemList.length; i++) 
                list += "<li>" + itemList[i] + "<span class = 'close' id= " + i + ">X</span></li>" 
                    //+= 이거를 꼭 달아줘야함. 전에 항목에 누적해야되니까.
                    //span : 요소 안에 영역을 지정해주는 것, close클래스값을 i가 가짐
            list += "/ul"; //for문을 나와서 ul를 닫아줌
            document.querySelector("#itemLists").innerHTML = list;
                //innerHTML이란 HTML에 해당항목(ul~ul부터의 항목)을 삽입하라는 것. 그래서 그걸 list에 저장.
            var remove = document.querySelectorAll(".close") 
                //쿼리셀렉터올 : .close의 항목들을 배열의 형태로 가지고 옴.
                //그래서 그게 다 변수 remove에 저장될 거.
                //쿼리셀렉터는 객체 정보를 가져옴
                
                //화면에서 remove 할 배열의 모든 요소들을 확인하고 특정 요소를 클릭하면
                //removelist 실행
            for(var i=0; i<remove.length; i++) //i는 remove의 길이 전까지 하나씩 다 검사를 해보고 
                remove[i].addEventListener("click", removelist);
                //i번째 아이에 대해서 이벤트 기능을 추가시킨 다음에 저 x를 클릭했을 경우에 리무브리스트를 불러옴
                
        }//end showlist

        //removeList 함수 구현
            //close가 가지고 있는 아이디를 갖고 와서 아이디를 매칭시켜서 지워줄거임
        function removeList() {
            var id = this.getAttribute("id"); 
                //클로즈가 있는 요소들 중에 아이디를 가지고 옴.그래서 id에 그 값들을 저장함.
            itemList.splice(id, 1) //splice 기능을 사용해서 원하는 것을 삭제할 수있음.
            showList(); //화면에 삭제한 것을 제외하고 리스트를 다시 보여주는 기능.
        }