var vez = 1;
			
$(".casa").click(function(){
    var bg = $(this).css("background-image");
    if(bg == "none" || bg == "")
    {         
        var fig = "url(/asserts/img/" + vez.toString() + ".jpg)";
        $(this).css("background", fig);
        
        jQuery.ajax ({
            url: "/game",
            type: "POST",
            data: JSON.stringify({ turn: vez, position: $(this).attr("id") }),
            dataType: "json",
            contentType: "application/json",
            success: function(data, status){
                console.log(data);
                
                if (data > 0){
                	$(this).prop('disabled', true);
                	alert("Vitória do " + (data == 1 ? "X" : "O"));
                }
            }
        });
        
        vez = (vez == 1? 2:1); 
    }
});