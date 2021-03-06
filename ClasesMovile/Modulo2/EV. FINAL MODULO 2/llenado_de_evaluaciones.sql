--INSERTAR 2 EVALUACIONES--
Insert into TEST (IDTEST,NOMBRETEST,DESCRIPCIONTEST,PROGRAMA,UNIDAD,FECHACREACION,ESTUDIANTE_IDESTUDIANTE,EXAMINADOR_IDEXAMINADOR) 
	values ('11','MATEMATICA','EJEMPLO DE DESCRIPCION','SUMA','1',to_date('25/08/20','DD/MM/RR'),null,'111');
Insert into TEST (IDTEST,NOMBRETEST,DESCRIPCIONTEST,PROGRAMA,UNIDAD,FECHACREACION,ESTUDIANTE_IDESTUDIANTE,EXAMINADOR_IDEXAMINADOR) 
values ('12','MATEMATICA','EJEMPLO DE DESCRIPCION','RESTA','1',to_date('25/08/20','DD/MM/RR'),null,'111');


--INSERTAR 10 PREGUNTAS--
Insert into PREGUNTAS (IDPREGUNTA,ENUNCIADO,PUNTAJEASOCIADO,TEST_IDTEST) 
	values ('1','1+1','10','11');
Insert into PREGUNTAS (IDPREGUNTA,ENUNCIADO,PUNTAJEASOCIADO,TEST_IDTEST) 
	values ('2','12+1','20','11');
Insert into PREGUNTAS (IDPREGUNTA,ENUNCIADO,PUNTAJEASOCIADO,TEST_IDTEST) 
	values ('3','5+0','10','11');
Insert into PREGUNTAS (IDPREGUNTA,ENUNCIADO,PUNTAJEASOCIADO,TEST_IDTEST) 
	values ('4','4+20','10','11');
Insert into PREGUNTAS (IDPREGUNTA,ENUNCIADO,PUNTAJEASOCIADO,TEST_IDTEST) 
	values ('5','55+1+2','20','11');
Insert into PREGUNTAS (IDPREGUNTA,ENUNCIADO,PUNTAJEASOCIADO,TEST_IDTEST) 
	values ('6','54+2+6','10','11');
Insert into PREGUNTAS (IDPREGUNTA,ENUNCIADO,PUNTAJEASOCIADO,TEST_IDTEST) 
	values ('7','55+1+2','20','11');
Insert into PREGUNTAS (IDPREGUNTA,ENUNCIADO,PUNTAJEASOCIADO,TEST_IDTEST) 
	values ('8','55+1+2','20','11');
Insert into PREGUNTAS (IDPREGUNTA,ENUNCIADO,PUNTAJEASOCIADO,TEST_IDTEST) 
	values ('9','55+1+2','20','11');
Insert into PREGUNTAS (IDPREGUNTA,ENUNCIADO,PUNTAJEASOCIADO,TEST_IDTEST) 
	values ('10','55+1+2','20','11');


--INSERTAR 4 ALTERNATIVAS PARA CADA PREGUNTA--
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('1','2','BUENA','100','1');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('2','5','MALA','0','1');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('4','10','BUENA','0','2');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('5','14','MALA','0','2');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('6','13','BUENA','100','2');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('7','5','BUENA','100','3');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('8','2','MALA','0','3');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('9','7','MALA','0','3');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('10','23','MALA','0','4');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('11','24','BUENA','100','4');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('12','6','MALA','0','4');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('13','56','MALA','0','5');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('15','58','BUENA','100','5');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('16','-1','MALA','0','6');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('17','1','MALA','0','6');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('18','-0','MALA','0','6');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('19','3','BUENA','100','7');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('20','5','MALA','0','7');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('21','4','MALA','0','7');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('22','-4','BUENA','0','8');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('23','-4','BUENA','100','8');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('24','-4','BUENA','0','8');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('26','53','BUENA','100','9');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('27','24','MALA','0','9');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('28','3','BUENA','100','10');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('29','6','MALA','0','10');
Insert into ALTERNATIVAS (IDALTERNATIVAS,DESCRIPCION,RESULTADO,PORCENTAJE,PREGUNTAS_IDPREGUNTAS) values ('30','4','MALA','0','10');
