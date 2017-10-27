$(document).ready(function(){
    $("img").click(function(e){
		e.preventDefault();
        $.ajax({
			method: "GET",
			url: $(this).attr("id"),
			context: this,
			success: function(response) {
				html = response;
				var filtSRC = $(html).find("img#" + $(this).attr("id")).attr("src");
				console.log(filtSRC);
				$(this).attr("src", filtSRC);
			}
		});
    });
});