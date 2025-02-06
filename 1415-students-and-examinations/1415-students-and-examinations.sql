SELECT 
    st.student_id, 
    st.student_name,
    sb.subject_name,
    COUNT(ex.student_id) AS attended_exams
FROM
    Students st
JOIN
    Subjects sb    
LEFT JOIN
    Examinations ex
    ON
    sb.subject_name = ex.subject_name AND
    ex.student_id = st.student_id
GROUP BY
    st.student_id,
    st.student_name,
    sb.subject_name
ORDER BY 
    st.student_id