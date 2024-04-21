import { GithubOutlined } from '@ant-design/icons';
// @ts-ignore
import { DefaultFooter } from '@ant-design/pro-components';
// @ts-ignore
import React from 'react';

const Footer: React.FC = () => {
  const defaultMessage = 'henry出品';
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      copyright={`${defaultMessage}`}
      links={[
        {
          key: 'X智能 BI',
          title: 'X智能 BI',
          href: 'https://pro.ant.design',
          blankTarget: true,
        },
        {
          key: 'github',
          title: <GithubOutlined />,
          href: 'https://github.com/ant-design/ant-design-pro',
          blankTarget: true,
        },
        {
          key: 'X智能 BI',
          title: 'X智能 BI',
          href: 'https://ant.design',
          blankTarget: true,
        },
      ]}
    />
  );
};

export default Footer;
