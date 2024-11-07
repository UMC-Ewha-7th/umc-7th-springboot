# # INSERT INTO region (id, name, created_at, updated_at)
# # VALUES (1, '서울', NOW(), NOW()),
# #        (2, '부산', NOW(), NOW()),
# #        (3, '인천', NOW(), NOW());
# #
# # INSERT INTO store (id, name, address, score, region_id, created_at, updated_at)
# # VALUES (1, 'Store 1', '서울시 서대문구 이화여대길 52', 4.5, 1, NOW(), NOW()),
# #        (2, 'Store 2', '서울시 마포구 연남동', 3.8, 1, NOW(), NOW()),
# #        (3, 'Store 3', '서울시 동작구 흑석동', 2.2, 1, NOW(), NOW()),
# #        (4, '요아정', '서울시 용산구 이태원동', 4.0, 1, NOW(), NOW()),
# #        (5, '요아정', '서울시 서대문구 이화여대길 52', 3.2, 1, NOW(), NOW()),
# #        (6, '요아정', '서울시 강남구 대치동', 4.5, 1, NOW(), NOW());
# #
# INSERT INTO mission (id, mission_spec, store_id, reward, deadline, created_at, updated_at)
# VALUES (1, 'Store 1-미션 1', 1, 12000, '2024-12-12', NOW(), NOW()),
#        (2, 'Store 1-미션 2', 1, 10000, '2024-12-13', NOW(), NOW()),
#        (3, 'Store 2-미션 1', 1, 5000, '2024-12-10', NOW(), NOW()),
#        (4, 'Store 3-미션 1', 3, 10000, '2024-12-31', NOW(), NOW());
#
# INSERT INTO member(id, name, gender, address, spec_address, social_type, member_status, inactive_date, email, point)
# VALUES(1,'김다운', 'FEMALE', '서울시 서대문구', '서대문구' ,null,null,null,'daun@mail.com',500),
#       (2,'이다혜', 'FEMALE', '서울시 서대문구', '서대문구', null, null, null, 'dahye@mail.com',400);
#
# INSERT INTO member_mission(id, created_at, updated_at, status, member_id, mission_id)
# VALUES(1, NOW(), NOW(), 'CHALLENGING',1,1),
#       (2, NOW(), NOW(), 'CHALLENGING',1,2),
#       (3, NOW(), NOW(), 'COMPLETE',1,3);
#
# INSERT INTO review (id, body, score, store_id, created_at, updated_at)
# VALUES (1, '너무 좋아요!', 5.0, 1, NOW(), NOW()),
#        (2, '분위기 짱~', 3.0, 1, NOW(), NOW()),
#        (3, '서비스가 좋습니다', 4.8, 2, NOW(), NOW()),
#        (4, '음식이 맛있고 사장님이 친절해요', 4.5, 3, NOW(), NOW());